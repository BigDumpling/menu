package com.ligq.example.menu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/29, 16:50
 */
@Slf4j
public class LocalDateTimeTest {
    @Test
    public void doTest(){
        LocalDateTime l1 = LocalDateTime.of(2018, 1, 29, 17, 20, 0);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime l2 = LocalDateTime.now();

        log.info("l1 == {}", l1.toString());
        log.info("l2 == {}", l2.toString());
        Duration d = Duration.between(l1, l2);
        log.info("d == {}", d.toString());
        log.info("d.getSeconds() == {}", d.getSeconds());
        log.info("d.getNano() == {}", d.getNano());

        assert true : "assert test true";
        assert false : "assert test false";
    }
}
