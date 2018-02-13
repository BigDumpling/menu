package com.ligq.example.menu.service;

import com.ligq.example.menu.model.ebyf.TMenuRoleResource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
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
 * @date 2018/1/26, 19:54
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EbyfRoleResourceServiceTest {

    @Autowired
    private EbyfRoleResourceService ebyfRoleResourceService;

    @Test
    public void insertTest() {
        TMenuRoleResource t = new TMenuRoleResource();
        t.setRoleId(2);
        t.setResourceId(2);
        Assert.assertEquals(1, ebyfRoleResourceService.insert(t));
    }
}
