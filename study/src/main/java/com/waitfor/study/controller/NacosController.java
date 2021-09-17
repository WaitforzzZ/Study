package com.waitfor.study.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类型描述
 *
 * @author zhouliang
 * @since 2021-9-17下午 9:08
 */
@RestController
public class NacosController {

    @Value("${isAlive}")
    private String name;

    @GetMapping("/nacos")
    public String sayHello(){
        return "Hello:"+name;
    }
}
