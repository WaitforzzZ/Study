package com.waitfor.study.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.waitfor.study.domain.entity.Hello;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类型描述
 *
 * @author zhouliang
 * @since 2021-2-5下午 12:46
 */
@Api(tags = "首页模块")
@RestController
public class IndexController {

    @ApiOperationSupport(order = 1)
    @GetMapping("/sayHi")
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "向客人问好")
    public String sayHi(@RequestParam(value = "name")String name){
        return "Hi:"+name;
    }

    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "sayHello")
    @PostMapping("/sayHello")
    public String sayHello(Hello hello){
        return "Hello:"+hello.getUsername();
    }
}
