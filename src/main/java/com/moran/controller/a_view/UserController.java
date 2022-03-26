package com.moran.controller.a_view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController  {
    @RequestMapping("save")
    public String save(Model model){
        System.out.println("UserController.save");
        model.addAttribute("mimi","123");
        return "myView";
    }
}
