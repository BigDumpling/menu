package com.ligq.example.menu.service.impl;

import com.ligq.example.menu.mapper.ebyf.EbyfCustomMapper;
import com.ligq.example.menu.mapper.ebyf.TMenuRoleResourceMapper;
import com.ligq.example.menu.model.ebyf.TMenuRoleResource;
import com.ligq.example.menu.service.EbyfRoleResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 10:09
 */
@Slf4j
@Service("ebyfRoleResourceService")
public class EbyfRoleResourceServiceImpl implements EbyfRoleResourceService {

    private TMenuRoleResourceMapper tMenuRoleResourceMapper;
    private EbyfCustomMapper ebyfCustomMapper;

    @Autowired
    public EbyfRoleResourceServiceImpl(TMenuRoleResourceMapper tMenuRoleResourceMapper,
                                       EbyfCustomMapper ebyfCustomMapper) {
        this.tMenuRoleResourceMapper = tMenuRoleResourceMapper;
        this.ebyfCustomMapper = ebyfCustomMapper;
    }

    @Override
    public List<TMenuRoleResource> findAll() {
        return tMenuRoleResourceMapper.selectAll();
    }

    @Override
    public int insertList(List<TMenuRoleResource> list) {
        log.info("EbyfRoleResourceService.insertList() size == {}", list.size());
        return tMenuRoleResourceMapper.insertList(list);
    }

    @Override
    public int insert(TMenuRoleResource t) {
        log.info("EbyfRoleResourceService.insert() t == {}", t);
        int i = ebyfCustomMapper.insert(t);
        log.info("EbyfRoleResourceService.insert() t.id == {}", t.getId());
        return i;
    }
}
