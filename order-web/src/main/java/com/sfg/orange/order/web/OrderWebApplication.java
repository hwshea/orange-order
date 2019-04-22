package com.sfg.orange.order.web;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = {"com.sfg.orange.order.*"})
@ImportResource(value = {"classpath:dubbo/providers.xml"})
@MapperScan(basePackages = {"com.sfg.orange.dao.mapper"})
public class OrderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderWebApplication.class, args);
    }

}
