package com._520it.wms.service.impl;

import com._520it.wms.domain.Depot;
import com._520it.wms.mapper.DepotMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IDepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepotServiceImpl implements IDepotService {
    @Autowired
    private DepotMapper depotMapper;
    @Override
    public void saveOrUpdate(Depot dept) {
        if(dept!=null&&dept.getId()!=null){
            depotMapper.updateByPrimaryKey(dept);
        }else{
            depotMapper.insert(dept);
        }
    }

    @Override
    public void delete(Long id) {
        depotMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Depot get(Long id) {

        return depotMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Depot> list() {

        return depotMapper.selectAll();
    }

    @Override
    public PageResult query(QueryObject qo) {
        int count = depotMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),depotMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
