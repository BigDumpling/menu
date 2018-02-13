package com.ligq.example.menu.service.impl;

import com.ligq.example.menu.mapper.menu.MenuCustomMapper;
import com.ligq.example.menu.mapper.menu.TbResourceMapper;
import com.ligq.example.menu.model.menu.TbResource;
import com.ligq.example.menu.service.MenuResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 9:47
 */
@Slf4j
@Service("menuResourceService")
public class MenuResourceImpl implements MenuResourceService {

    private TbResourceMapper tbResourceMapper;
    private MenuCustomMapper menuCustomMapper;

    @Autowired
    public MenuResourceImpl(TbResourceMapper tbResourceMapper,
                            MenuCustomMapper menuCustomMapper) {
        this.tbResourceMapper = tbResourceMapper;
        this.menuCustomMapper = menuCustomMapper;
    }

    @Override
    public List<TbResource> findAll() {
        return tbResourceMapper.selectAll();
    }

    @Override
    public List<TbResource> findBySystemId(String systemId) {
        assert !Objects.isNull(systemId) : "MenuResourceService.findBySystemId() system id can't be null";

        TbResource query = new TbResource();
        query.setSystemId(systemId);
        return tbResourceMapper.select(query);
    }

    @Override
    public TbResource findById(String id) {
        log.info("MenuResourceService.findById() id == {}", id);
        return menuCustomMapper.findById(id);
    }
}
