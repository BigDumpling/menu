package com.ligq.example.menu.service.impl;

import com.ligq.example.menu.mapper.menu.TbResourceMapper;
import com.ligq.example.menu.model.menu.TbResource;
import com.ligq.example.menu.service.MenuResourceService;
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
@Service("menuResourceService")
public class MenuResourceImpl implements MenuResourceService {

    private TbResourceMapper tbResourceMapper;

    @Autowired
    public MenuResourceImpl(TbResourceMapper tbResourceMapper) {
        this.tbResourceMapper = tbResourceMapper;
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
}
