package com.tch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.tch.mapper")
/**
 * 核心功能：将当前的 AOP 代理对象暴露到 AopContext中
 * 获取方式：可以通过 AopContext.currentProxy()获取当前代理对象
 * 存储位置：代理对象存储在 ThreadLocal中，线程安全
 */
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableAsync
public class TaoPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaoPictureBackendApplication.class, args);
    }

}
