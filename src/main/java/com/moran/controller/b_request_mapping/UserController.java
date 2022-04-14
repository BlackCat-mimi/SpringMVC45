package com.moran.controller.b_request_mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Parameter;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "save",method = {RequestMethod.POST,RequestMethod.GET})
    public String save(){
        System.out.println("UserController.save");
        return "abc";
    }
    //页面需要传递params声明的参数，且值必须相等，这样才能访问该方法
    @RequestMapping(value = "login",params = {"token=mimi"})
    public String login(String uname,String upwd){
        System.out.println("UserController.login:" + uname + ":" + upwd);
        return "abc";
    }

    //可以在RequestMapping中声明headers,获得页面传递的请求头，从请求头中获得对应的信息，如果该信息相等，允许访问该方法
    @RequestMapping(value = "list",headers = "Host=localhost:8080")
    public String list(){
        System.out.println("UserController.list");
        return "abc";
    }
    //要使用注解 （传参与形参不一样）  使用 路径变量注解
    @RequestMapping("login2/{uname}/{upwd}")
    public String login2(@PathVariable("upwd") String p,@PathVariable("uname") String n){
        System.out.println("UserController.login2:" + n + ":" +p);
        return "abc";
    }


}
