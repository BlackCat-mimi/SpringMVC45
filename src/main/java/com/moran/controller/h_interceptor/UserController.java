package com.moran.controller.h_interceptor;

import com.moran.controller.e_validator.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @RequestMapping("list")
    public String list(){
        System.out.println("UserController.list");
        return null;
    }

    @RequestMapping("login")
    public String login(){
        System.out.println("UserController.login");
        return null;
    }
}
