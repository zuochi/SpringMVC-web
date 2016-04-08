package com.lzf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试控制器
 */
@Controller
public class TestController {

    @RequestMapping("login")
    private @ResponseBody String hello(
            @RequestParam(value = "username", required = false)String username,
            @RequestParam(value = "password", required = true)String password){

        return "Hello "+username+",Your password is: "+password;
    }

   /* @RequestMapping("/index")
    private String hello(String name){
        return "index";
    }*/

}
