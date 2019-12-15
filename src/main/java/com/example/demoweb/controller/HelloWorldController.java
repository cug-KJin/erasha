package com.example.demoweb.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @ApiOperation(value = "测试",notes = "这是一个测试")
    @RequestMapping(value = "/hello")
    public String get(){
        return "Hello World!";
    }
}
