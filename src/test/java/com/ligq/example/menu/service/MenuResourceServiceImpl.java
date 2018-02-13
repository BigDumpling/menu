package com.ligq.example.menu.service;

import com.ligq.example.menu.model.menu.TbResource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 19:36
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MenuResourceServiceImpl {

    @Autowired
    private MenuResourceService menuResourceService;

    @Test
    public void findByIdTest(){
        TbResource t1 = menuResourceService.findById("4EE866CF9BA06E54E0535C5910AC0997");
        log.info("t1.name == {}", t1.getName());
        TbResource t2 = menuResourceService.findById("4C7BBE6C0A0941A5E0535C5910ACC116");
        log.info("t2.name == {}", t2.getName());
    }
}
