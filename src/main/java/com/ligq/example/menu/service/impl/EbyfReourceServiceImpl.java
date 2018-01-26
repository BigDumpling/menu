package com.ligq.example.menu.service.impl;

import com.ligq.example.menu.mapper.ebyf.TMenuResourceMapper;
import com.ligq.example.menu.model.ebyf.TMenuResource;
import com.ligq.example.menu.service.EbyfReourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 9:49
 */
@Slf4j
@Service("ebyfReourceService")
public class EbyfReourceServiceImpl implements EbyfReourceService {

    private TMenuResourceMapper tMenuResourceMapper;

    @Autowired
    public EbyfReourceServiceImpl(TMenuResourceMapper tMenuResourceMapper) {
        this.tMenuResourceMapper = tMenuResourceMapper;
    }

    @Override
    public List<TMenuResource> findAll() {
        return tMenuResourceMapper.selectAll();
    }

    @Override
    public int insertList(List<TMenuResource> list) {
        log.info("-------------------list.size() == {}", list.size());
        return tMenuResourceMapper.insertList(list);
    }
}
