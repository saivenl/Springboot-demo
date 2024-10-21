package com.example.wy.controller;

import com.example.wy.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
@RestController
public class UserController {
        @ApiOperation("获取用户")
        @GetMapping("/user/{id}")
        public String getUserById(@PathVariable int id){
            System.out.println(id);
            return"根据ID获取用户信息";
        }

            @PostMapping("/user")
            public String save(User user){
                return "添加用户";
            }
            @PutMapping("/user")
                public String update(User user){return"更新用户";}

            @DeleteMapping("/user/{id}")
                    public String deleteById(@PathVariable int id){
                    return"根据ID删除用户";}
}
