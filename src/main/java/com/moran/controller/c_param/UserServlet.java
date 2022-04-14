package com.moran.controller.c_param;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获得表单传递的值
        Map<String, String[]> parameterMap = req.getParameterMap();
        //将值自动封装到对象中
        User user = (User) Tools.map2Objext(parameterMap,User.class);
        System.out.println("UserServlet.doPost():" + user);
    }
}