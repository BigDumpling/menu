package com.ligq.example.menu.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/25, 21:13
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.menu")
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
