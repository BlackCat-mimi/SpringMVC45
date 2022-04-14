package com.moran.controller.c_param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    /**
     * 在SpringMVC的Contorller中，不再需要request.getParameter() ,直接在方法的参数中声明即可，要求参数名和表单控件的名字一致
     * 如果非要不一致，则需要添加注解 @RequestParam("表单的name值")
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("save1")
    public String save1(String name,@RequestParam("pwd") String password){

        System.out.println("UserController.save1:" + name + ":" + password);
        return null;
    }
    //SpringMVC的Controller,可以对数据进行自动转换
    @RequestMapping("save2")
    public String save2(float age){
        System.out.println("UserController.save2:" + 18.5);//输出出生年份

        return null;
    }
    //可以将表单的数据自动封装成对象（参数中指定的类型）
    @RequestMapping("save3")
    public String save3(User user){
        System.out.println("UserController.save3:" + user);//输出出生年份

        return null;
    }
    //复选框的值可以直接获取为字符串数据，整型数据，如果需要List<Interge> 类型，刚需要添加注解@RequestParam
    @RequestMapping("save4")
    public String save3(@RequestParam  List<Integer> ids ){
        System.out.println("UserController.save4:" + ids.get(0));

        return null;
    }

}
