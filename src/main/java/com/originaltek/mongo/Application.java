package com.originaltek.mongo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 15:45
 * @todo 启动类
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.originaltek.mongo.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
