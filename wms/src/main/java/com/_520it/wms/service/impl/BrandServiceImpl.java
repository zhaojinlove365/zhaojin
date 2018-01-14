package com._520it.wms.service.impl;

import com._520it.wms.domain.Brand;
import com._520it.wms.mapper.BrandMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public void saveOrUpdate(Brand dept) {
        if(dept!=null&&dept.getId()!=null){
            brandMapper.updateByPrimaryKey(dept);
        }else{
            brandMapper.insert(dept);
        }
    }

    @Override
    public void delete(Long id) {
        brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Brand get(Long id) {

        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Brand> list() {

        return brandMapper.selectAll();
    }

    @Override
    public PageResult query(QueryObject qo) {
        int count = brandMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),brandMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
