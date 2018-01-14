package com._520it.wms.service.impl;

import com._520it.wms.domain.Permission;
import com._520it.wms.mapper.PermissionMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IPermissionService;
import com._520it.wms.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


@Service
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private PermissionMapper permissiontMapper;
    @Autowired
    ApplicationContext ctx;

    @Override
    public void delete(Long id) {
        permissiontMapper.deleteByPrimaryKey(id);
    }


    @Override
    public List<Permission> list() {

        return permissiontMapper.selectAll();
    }

    @Override
    public PageResult query(QueryObject qo) {
        int count = permissiontMapper.queryForCount(qo);
        if (count > 0) {
            return new PageResult(qo.getCurrentPage(), qo.getPageSize()
                    , permissiontMapper.queryForList(qo), count);
        }
        return PageResult.EMPTY_RESULT;
    }

    @Override
    public void reload() {

        //如果权限表达式在数据库中，就不在保存
        List<String> exps = permissiontMapper.selectAllExpression();

        //扫描所有Conroller类，有没Controller或RestController注解
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Controller.class);
        beans.putAll(ctx.getBeansWithAnnotation(RestController.class));
        for (Object bean : beans.values()) {
            //扫描每个Controller类中的每个方法
            Method[] ms = bean.getClass().getDeclaredMethods();
            for (Method m : ms) {
                //判断方法是否有RequiredPermission注解
                RequiredPermission rp = m.getAnnotation(RequiredPermission.class);
                String exp = bean.getClass().getName() + ":" + m.getName();
                if(!exps.contains(exp)){
                    if(rp!=null){
                        //有，就创建Permission对象，设置属性，保存到数据库中，没有不管
                        Permission p = new Permission();
                        p.setName(rp.value());
                        p.setExpression(exp);
                        permissiontMapper.insert(p);
                    }
                }
            }
        }
    }
}
