package com._520it.wms.service.impl;

import com._520it.wms.domain.Supplier;
import com._520it.wms.mapper.SupplierMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.QueryObject;
import com._520it.wms.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public void saveOrUpdate(Supplier supplier) {
        if(supplier!=null&&supplier.getId()!=null){
            supplierMapper.updateByPrimaryKey(supplier);
        }else{
            supplierMapper.insert(supplier);
        }
    }

    @Override
    public void delete(Long id) {
        supplierMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Supplier get(Long id) {

        return supplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Supplier> list() {

        return supplierMapper.selectAll();
    }

    @Override
    public PageResult query(QueryObject qo) {
        int count = supplierMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),supplierMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
