package com.demo.easy.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by liu.hongda
 * @Description TODO
 * @Date 2019/7/1 16:56
 */

@RestController
public class Demo {

    @GetMapping("/index")
    public String demo(){
        return "testDemo";
    }
}
