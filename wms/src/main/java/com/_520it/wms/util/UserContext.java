package com._520it.wms.util;

import com._520it.wms.domain.Employee;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


public class UserContext {

    public static final String USER_IN_SESSION="user_in_session";
    public static final String PERMISSION_IN_SESSION="permission_in_session";

    //使用RequestContextHolder 获取请求对象，返回session
    public static HttpSession getSession(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        return request.getSession();
    }

    //把用户信息设置到session中
    public static void setCurrentUser(Employee currentUser) {
        if(currentUser!=null){
            getSession().setAttribute(USER_IN_SESSION,currentUser);
        }else{
            getSession().invalidate(); //销毁session
        }
    }

    //获取session中的用户信息
    public static Employee getCurrentUser(){
        return (Employee) getSession().getAttribute(USER_IN_SESSION);
    }

    //把权限表达式设置到session中
    public static void setPermissionExpressions(List<String> expressions) {
        getSession().setAttribute(PERMISSION_IN_SESSION,expressions);
    }

    //从session获取权限表达式集合
    public static List<String> getPermissionExpressions() {
        return (List<String>)getSession().getAttribute(PERMISSION_IN_SESSION);
    }

}
