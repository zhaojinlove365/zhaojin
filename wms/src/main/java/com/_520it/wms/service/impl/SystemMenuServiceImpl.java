package com._520it.wms.service.impl;

import com._520it.wms.domain.SystemMenu;
import com._520it.wms.mapper.SystemMenuMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.SystemMenuQueryObject;
import com._520it.wms.service.ISystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class SystemMenuServiceImpl implements ISystemMenuService {
    @Autowired
    private SystemMenuMapper systemMenuMapper;


    @Override
    public void saveOrUpdate(SystemMenu systemMenu) {
        if(systemMenu!=null&&systemMenu.getId()!=null){
            systemMenuMapper.updateByPrimaryKey(systemMenu);
        }else{
            systemMenuMapper.insert(systemMenu);
        }
    }

    @Override
    public void delete(Long id) {
        systemMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SystemMenu get(Long id) {
        return systemMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SystemMenu> list() {
        return systemMenuMapper.selectAll();
    }


    @Override
    public PageResult query(SystemMenuQueryObject qo) {
        int count = systemMenuMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),systemMenuMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }

    @Override
    public List<Map<String, Object>> queryMenus(SystemMenu current) {
        List<Map<String,Object>> list = new ArrayList<>();
        while(current!=null){
            Map<String, Object> map = new HashMap<>();
            list.add(map);
            map.put("id",current.getId());
            map.put("name",current.getName());
            current=current.getParent();
        }
        Collections.reverse(list);
        return list;
    }

    @Override
    public List<Map<String, Object>> queryMenusByParentSn(String parentSn) {
        return systemMenuMapper.queryMenusByParentSn(parentSn);
    }

    @Override
    public List<Map<String, Object>> queryMenusByParentSnAndEmployeeId(String parentId,Long employeeId) {
        return systemMenuMapper.queryMenusByParentSnAndEmployeeId(parentId,employeeId);
    }
}
