package com.example.wy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//可以接收客户端的请求
public class HelloController {
    //nickname = zhangsan
    //@GetMapping("/hello")//浏览器发送get请求来访问方法
@RequestMapping(value = "hello", method = RequestMethod.GET)
    //http://localhost:8080/hello?nickname=zhangsan&phone=123

    public String hello(String nickname,String phone) {
        System.out.println(phone);
        return "你好" + nickname;
    }
}


