package com.moran.controller.a_view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyView implements View {

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //就是model中添加的数据
        for(Map.Entry<String,?> entry:model.entrySet()){
            request.setAttribute(entry.getKey(),entry.getValue());
        }
        request.getRequestDispatcher("abc.jsp").forward(request,response);
    }
}
