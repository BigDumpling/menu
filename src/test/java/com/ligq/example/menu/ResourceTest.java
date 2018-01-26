package com.ligq.example.menu;

import com.ligq.example.menu.model.ebyf.TMenuResource;
import com.ligq.example.menu.model.menu.TbResource;
import com.ligq.example.menu.service.EbyfReourceService;
import com.ligq.example.menu.service.MenuResourceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/26, 9:51
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ResourceTest {

    @Autowired
    private MenuResourceService menuResourceService;
    @Autowired
    private EbyfReourceService ebyfReourceService;

    @Test
    public void doTest() {
        List<TbResource> menus = menuResourceService.findAll();
        log.info("menus size == {}", menus.size());

        List<TMenuResource> ebyf = ebyfReourceService.findAll();
        log.info("ebyf size == {}", ebyf.size());
    }
}
