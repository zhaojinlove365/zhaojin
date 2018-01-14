package com._520it.wms.web.interceptor;

import com._520it.wms.domain.Employee;
import com._520it.wms.util.RequiredPermission;
import com._520it.wms.util.SystemException;
import com._520it.wms.util.UserContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

//权限登陆检查
public class SecurityInterceptor extends HandlerInterceptorAdapter{
    //用请求上的权限【标签】和用户session中的权限表达式集合比较，是否包含，有就放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1.判断对象是否为超级管理员
        Employee currentUser = UserContext.getCurrentUser();
        if(currentUser.isAdmin()){
            return true;//放行
        }
        //2.当前请求 方法上不缺RequiredPermission标签
        HandlerMethod hm= (HandlerMethod) handler;
        if(!hm.getMethod().isAnnotationPresent(RequiredPermission.class)){
            return true;
        }
          //获取controller方法的权限表达式
        String exp = hm.getMethod().getDeclaringClass().getName() + ":" + hm.getMethod().getName();
        List<String> exps = UserContext.getPermissionExpressions();
        if(exps.contains(exp)){
            return true;
        }

        throw new SystemException("亲，你没有权限，请联系管理员!"); //跳到权限不足页面
    }
}
