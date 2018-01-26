/*
 * Copyright (c) 2018. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.example.menu.api;

import com.ligq.example.menu.model.ebyf.TMenuResource;
import com.ligq.example.menu.model.ebyf.TMenuRoleResource;
import com.ligq.example.menu.model.menu.TbResource;
import com.ligq.example.menu.service.EbyfReourceService;
import com.ligq.example.menu.service.EbyfRoleResourceService;
import com.ligq.example.menu.service.MenuResourceService;
import com.ligq.example.menu.util.enums.ResourceTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/24, 20:17
 */
@Slf4j
@RestController
public class DataControlApi {

    private MenuResourceService menuResourceService;
    private EbyfReourceService ebyfReourceService;
    private EbyfRoleResourceService ebyfRoleResourceService;

    @Autowired
    public DataControlApi(MenuResourceService menuResourceService,
                          EbyfReourceService ebyfReourceService,
                          EbyfRoleResourceService ebyfRoleResourceService) {
        this.menuResourceService = menuResourceService;
        this.ebyfReourceService = ebyfReourceService;
        this.ebyfRoleResourceService = ebyfRoleResourceService;
    }

    /**
     * 菜单数据从cert数据库转到ebyf_menu数据库
     * @param systemId
     */
    public void processResources(String systemId) {
        List<TbResource> cert = menuResourceService.findBySystemId(systemId);

        List<TMenuResource> ebyf = cert.stream()
                .filter(f -> Objects.isNull(f.getParentId()))
                .map(m -> convertData2(m, 0, ResourceTypeEnum.MENU.getType()))
                .collect(Collectors.toList());

        log.info("size == {}", ebyf.size());

        //first menu
        int i1 = ebyfReourceService.insertList(ebyf);
        log.info("---------------------------------------------first menu size == {}", i1);
        //second menu
        List<TMenuResource> menu2 = secondMenu(cert, ebyf);
        int i2 = ebyfReourceService.insertList(menu2);
        log.info("---------------------------------------------second menu size == {}", i2);

        //third menu
        List<TMenuResource> menu3 = thirdMenu(cert, menu2);
        int i3 = ebyfReourceService.insertList(menu3);
        log.info("---------------------------------------------second menu size == {}", i3);

        log.info("---------------------------------------------success");
    }

    /**
     * 为角色添加资源
     * @param roleId
     */
    public void processRoleResource(Integer roleId) {
        List<TMenuRoleResource> list = ebyfReourceService.findAll()
                .stream()
                .map(m -> {
                    TMenuRoleResource domain = new TMenuRoleResource();
                    domain.setRoleId(roleId);
                    domain.setResourceId(m.getId());
                    return domain;
                })
                .collect(Collectors.toList());
        int ro = ebyfRoleResourceService.insertList(list);
        log.info("-----------------add role resource size == {}", ro);
    }

    /**
     * 1.构建一级菜单map, key=id, value=code
     * 2.遍历key,根据key匹配所有parentId=key的原数据库数据,根据value匹配所有code=value的新数据库的数据,组合数据
     *
     * @param cert
     * @param ebyf
     */
    private List<TMenuResource> secondMenu(final List<TbResource> cert, final List<TMenuResource> ebyf) {
        Map<String, String> codes = new HashMap<>(20);
        cert.stream()
                .filter(f -> Objects.isNull(f.getParentId()))
                .forEach(m -> codes.put(m.getId(), m.getCode()));

        List<TMenuResource> resources = new ArrayList<>();
        codes.keySet().stream()
                .forEach(f -> {
                    List<TMenuResource> l = buildMenu2(cert, ebyf, f, codes.get(f));
                    if (!ObjectUtils.isEmpty(l)) {
                        resources.addAll(l);
                    }
                });

        return resources;
    }

    /**
     * 构建按钮
     * @param cert
     * @param menu2
     * @return
     */
    private List<TMenuResource> thirdMenu(final List<TbResource> cert, final List<TMenuResource> menu2) {
        Map<String, Integer> codes = new HashMap<>(cert.size());

        menu2.stream()
                .filter(f -> ResourceTypeEnum.UI.getType().equals(f.getType()) && !"#".equals(f.getUrl()))
                .forEach(f -> codes.put(f.getCode(), f.getId()));

        List<TMenuResource> resources = new ArrayList<>();
        codes.keySet().stream()
                .forEach(f -> {
                    List<TMenuResource> l = buildMenu3(cert, codes.get(f), f);
                    if (!ObjectUtils.isEmpty(l)) {
                        resources.addAll(l);
                    }
                });

        return resources;
    }

    /**
     * 组合二级菜单数据
     * @param cert
     * @param ebyf
     * @param parentId
     * @param code
     * @return
     */
    private List<TMenuResource> buildMenu2(final List<TbResource> cert, final List<TMenuResource> ebyf, String parentId, String code) {
        final Integer menuId = ebyf.stream()
                .filter(f -> code.equals(f.getCode()))
                .map(TMenuResource::getId)
                .findFirst()
                .get();

        return cert.stream()
                .filter(f -> parentId.equals(f.getParentId()))
                .map(m -> convertData2(m, menuId, ResourceTypeEnum.UI.getType()))
                .collect(Collectors.toList());
    }

    /**
     * 组合三级菜单数据
     * @param cert
     * @param menuId
     * @param code
     * @return
     */
    private List<TMenuResource> buildMenu3(final List<TbResource> cert, Integer menuId, String code) {
        final String parentId = cert.stream()
                .filter(f -> code.equals(f.getCode()))
                .map(TbResource::getId)
                .findFirst()
                .get();

        return cert.stream()
                .filter(f -> parentId.equals(f.getParentId()))
                .map(m -> convertData2(m, menuId, ResourceTypeEnum.ACTION.getType()))
                .collect(Collectors.toList());
    }

    private TMenuResource convertData2(TbResource m, Integer parentId, String type) {
        TMenuResource r = new TMenuResource();
        r.setCode(m.getCode());
        r.setName(m.getName());
        r.setDescription(m.getDescription());
        r.setType(type);
        r.setUrl("/" + m.getUrl());
        r.setMethod(m.getMethod());
        r.setStyle(m.getStyle());
        r.setMatchKind(m.getMatchKind());
        r.setMethodParamName(m.getMethodParamName());
        r.setMethodParamValue(m.getMethodParamValue());
        r.setCreator("super");
        r.setCreateTime(LocalDateTime.now());
        r.setModifier("super");
        r.setModifyTime(LocalDateTime.now());
        r.setSystemId(1);
        r.setStatus(Boolean.TRUE);
        r.setParentId(parentId);
        r.setOrderNo(m.getOrderNo());
        return r;
    }
}
