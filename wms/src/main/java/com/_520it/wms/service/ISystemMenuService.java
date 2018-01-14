package com._520it.wms.service;

import com._520it.wms.domain.SystemMenu;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.SystemMenuQueryObject;

import java.util.List;
import java.util.Map;


public interface ISystemMenuService {

    void saveOrUpdate(SystemMenu systemMenu);

    void delete(Long id);

    SystemMenu get(Long id);

    List<SystemMenu> list();

    PageResult query(SystemMenuQueryObject qo);

    /**
     * 从指定菜单对象开始，一级一级找父级菜单
     * @param curernt
     * @return
     */
    List<Map<String,Object>> queryMenus(SystemMenu curernt);

    List<Map<String,Object>> queryMenusByParentSn(String parentSn);

    List<Map<String,Object>> queryMenusByParentSnAndEmployeeId(String parentSn,Long currentId);
}
