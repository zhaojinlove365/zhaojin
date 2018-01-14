package com._520it.wms.service.impl;

import com._520it.wms.domain.Brand;
import com._520it.wms.domain.Product;
import com._520it.wms.mapper.BrandMapper;
import com._520it.wms.mapper.ProductMapper;
import com._520it.wms.page.PageResult;
import com._520it.wms.query.ProductQueryObject;
import com._520it.wms.service.IProductService;
import com._520it.wms.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import java.util.List;


@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ServletContext servletContext;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public void saveOrUpdate(Product product) {
        if(product.getBrandId()!=null){
            Brand brand = brandMapper.selectByPrimaryKey(product.getBrandId());
            product.setBrandName(brand.getName());
        }
        if(product!=null&&product.getId()!=null){
            productMapper.updateByPrimaryKey(product);
        }else{
            productMapper.insert(product);
        }
    }

    @Override
    public void delete(Long id) {
        Product product = productMapper.selectByPrimaryKey(id);
        UploadUtil.deleteFile(servletContext,product.getImagePath());
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Product get(Long id) {

        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> list() {

        return productMapper.selectAll();
    }

    @Override
    public PageResult query(ProductQueryObject qo) {
        int count = productMapper.queryForCount(qo);
        if(count>0){
            return new PageResult(qo.getCurrentPage(),qo.getPageSize(),productMapper.queryForList(qo),count);
        }
        return PageResult.EMPTY_RESULT;
    }
}
