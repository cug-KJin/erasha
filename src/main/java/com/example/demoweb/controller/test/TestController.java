package com.example.demoweb.controller.test;

import com.example.demoweb.common.utils.ControllerUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
@Slf4j
public class TestController {
    @Autowired
    ControllerUtils controllerUtils;
    @ApiOperation(value = "测试",notes = "这是一个测试")
    @RequestMapping(value = "/test/{serviceCode}")
    public String get(@PathVariable String serviceCode, @RequestBody String reqParam){
        return controllerUtils.exec(serviceCode,"test",reqParam);
    }
}
