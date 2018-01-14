package com._520it.wms.web.interceptor;

import com._520it.wms.domain.Employee;
import com._520it.wms.util.UserContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登陆检查拦截器
public class CheckLoginInterceptor extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //session中当前用户为null，就跳到登陆页面，否则放行
        Employee current = UserContext.getCurrentUser();
        if (current == null) {
            response.sendRedirect("/login.jsp");
            return false; //拦截
        }

        return true; //session有信息，放行
    }
}
