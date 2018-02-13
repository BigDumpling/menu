package com.ligq.example.menu.service;

import com.ligq.example.menu.model.menu.TbResource;

import java.util.List;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 9:46
 */
public interface MenuResourceService {
    List<TbResource> findAll();

    List<TbResource> findBySystemId(String systemId);

    TbResource findById(String id);
}
