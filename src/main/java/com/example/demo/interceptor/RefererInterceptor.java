package com.example.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RefererInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       String referer =  request.getHeader("referer");
        if (!referer.startsWith("http://localhost")) {
            throw new Exception("REFERER : "+referer+", 403 forbidden access");
        }
        return true;
    }
}
