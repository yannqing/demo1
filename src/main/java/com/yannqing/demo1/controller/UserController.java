package com.yannqing.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试Jenkins Controller
 * @author: yannqing
 * @create: 2024-07-26 13:48
 **/
@RestController
public class UserController {

    @GetMapping("/getJenkins")
    public String Jenkins() {
        return "Hello Jenkins";
    }

}
