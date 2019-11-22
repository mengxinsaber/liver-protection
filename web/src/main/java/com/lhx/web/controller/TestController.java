package com.lhx.web.controller;

import com.lhx.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Name com.lhx.web.controller.Text
 * @Description * @Author lhx
 * @Version 2019/11/23 0:45
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String index(){
        return testService.getUser();
    }
}
