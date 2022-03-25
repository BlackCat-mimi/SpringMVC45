package com.moran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController3 {
    @RequestMapping("list")
    public ModelAndView list(){
        System.out.println("UserController3.save");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("list");
        //相当于request.setAttribute();
        // 重载 是  方法名相向，参数不同，不同是 类型不同，个数不同，位置不同
        User user = new User();
        user.setUname("mimi");
        user.setUpwd("123");
        mav.addObject("user",user);
        return mav;
    }
    @RequestMapping("list2")
    public ModelAndView list2(){
        System.out.println("UserController3.delete");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("list");
        //相当于request.setAttribute();
        // 重载 是  方法名相向，参数不同，不同是 类型不同，个数不同，位置不同

        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUname("mimi");
        user.setUpwd("123");
        User user2 = new User();
        user2.setUname("shahu");
        user2.setUpwd("456");
        list.add(user);
        list.add(user2);
        //request.setAttribute(); 名字默认为类型和泛型的组合
        mav.addObject(list);
        return mav;
    }

    @RequestMapping("list3")
    public String list3(Model model){
        System.out.println("UserController3.save");

        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUname("mimi");
        user.setUpwd("123");
        User user2 = new User();
        user2.setUname("longwei");
        user2.setUpwd("789");
        list.add(user);
        list.add(user2);

        model.addAttribute(list);

        return "list";
    }

    @RequestMapping("list4")
    public String list4(){
        return "redirect:list.jsp";
    }

}
