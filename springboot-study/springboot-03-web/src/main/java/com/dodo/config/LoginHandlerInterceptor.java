package com.dodo.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功之后，应该有用户的session
        final Object loginUser = request.getSession().getAttribute("loginUser");

        //没有登录
        if (loginUser == null){
            request.setAttribute("msg", "没有权限，请先登录");
            //转发请求
            request.getRequestDispatcher("/index.html").forward(request, response);
            //没有登录，不发行
            return false;
        } else {
            return true;
        }
    }
}