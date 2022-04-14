package com.moran.controller.f_ajax;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moran.controller.e_validator.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("list")
    @ResponseBody // 返回的对象交给  jackson-databind进行转json并输出的操作
    public List<User> save(HttpServletResponse response ){
        System.out.println("UserController.save");

        User user1 = new User();
        user1.setUname("uname1");
        user1.setUpwd("upwd1");

        User user2 = new User();
        user2.setUname("uname2");
        user2.setUpwd("upwd2");


        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);

//        ObjectMapper objectMapper = new ObjectMapper();
//        PrintWriter writer = null;
//        try {
//            writer = response.getWriter();
//            objectMapper.writeValue(writer,userList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            writer.flush();
//            writer.close();
//        }

        return userList;
    }
    @RequestMapping("save")
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("UserController.save" + user);
        return "ok";
    }

}
