package com.ligq.example.menu.service;

import com.ligq.example.menu.model.ebyf.TMenuRoleResource;

import java.util.List;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 10:08
 */
public interface EbyfRoleResourceService {
    List<TMenuRoleResource> findAll();

    int insertList(List<TMenuRoleResource> list);
}
