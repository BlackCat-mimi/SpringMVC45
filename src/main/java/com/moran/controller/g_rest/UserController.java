package com.moran.controller.g_rest;

import com.moran.controller.e_validator.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    //get请求做查询操作
    @GetMapping
    public String findAll(){
        System.out.println("UserController.findAll()");
        return null;
    }
    @GetMapping(value = "{id}")
    public String findAll(@PathVariable("id") Integer uid){
        System.out.println("UserController.findOne():" + uid);
        return null;
    }
    //post请求做新增操作
    @PostMapping
    public String save(User user){
        System.out.println("UserController.save():" + user);
        return null;
    }
    @PutMapping
    public String update(User user){
        System.out.println("UserController.update():" + user);
        return null;
    }
    @DeleteMapping(value = "{id}")
    public String delete(@PathVariable("id") Integer uid){
        System.out.println("UserController.delete():" + uid);
        return null;
    }

}
