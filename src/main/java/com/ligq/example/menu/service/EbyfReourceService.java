package com.ligq.example.menu.service;

import com.ligq.example.menu.model.ebyf.TMenuResource;

import java.util.List;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 9:48
 */
public interface EbyfReourceService {
    List<TMenuResource> findAll();

    int insertList(List<TMenuResource> list);
}
