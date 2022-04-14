package com.moran.controller.e_validator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("save")
    public String save(@Validated User user, Errors errors, Model model){
        System.out.println("UserController.save");
        //获得表单传递值校验的错误信息
        List<FieldError> fieldErrors = errors.getFieldErrors();

        if(fieldErrors != null & fieldErrors.size() != 0){
            for(FieldError fieldError : fieldErrors){
                System.out.println(fieldError.getField() + ":" + fieldError.getDefaultMessage());
                model.addAttribute(fieldError.getField() + "Message",fieldError.getDefaultMessage());
            }
            return "e";
        }

        return null;

    }

}
