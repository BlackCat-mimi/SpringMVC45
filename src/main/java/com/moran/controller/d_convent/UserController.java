package com.moran.controller.d_convent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class UserController {
    @RequestMapping("save1")
    public String save1(Date date){
        System.out.println("UserController.save1:" + date);
        return null;
    }
    @RequestMapping("login")
    public String save2(){
        return null;
    }


}
