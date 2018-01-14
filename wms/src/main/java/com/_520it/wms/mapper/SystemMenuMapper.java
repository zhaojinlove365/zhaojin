package com._520it.wms.mapper;

import com._520it.wms.domain.SystemMenu;
import com._520it.wms.query.QueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SystemMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemMenu systemMenu);

    SystemMenu selectByPrimaryKey(Long id);

    List<SystemMenu> selectAll();

    int updateByPrimaryKey(SystemMenu systemMenu);

    int queryForCount(QueryObject qo);

    List<SystemMenu> queryForList(QueryObject qo);

    List<SystemMenu> selectByRoleId(Long roleId);

    List<Map<String,Object>> queryMenusByParentSn(String parentSn);

    List<Map<String,Object>> queryMenusByParentSnAndEmployeeId(@Param("parentSn") String parentSn, @Param("employeeId") Long employeeId);
}