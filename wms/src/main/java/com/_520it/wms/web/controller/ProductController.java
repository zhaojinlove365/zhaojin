package com._520it.wms.web.controller;

import com._520it.wms.domain.Product;
import com._520it.wms.query.ProductQueryObject;
import com._520it.wms.service.IBrandService;
import com._520it.wms.service.IProductService;
import com._520it.wms.util.JSONResult;
import com._520it.wms.util.RequiredPermission;
import com._520it.wms.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IBrandService brandService;
    @Autowired
    private ServletContext servletContext;

    @RequiredPermission("商品列表")
    @RequestMapping("/list")
    public String list(@ModelAttribute("qo") ProductQueryObject qo, Model model){
        model.addAttribute("result",productService.query(qo));
        model.addAttribute("brands",brandService.list());
        return "product/list";
    }

    @RequiredPermission("商品删除")
    @RequestMapping("/delete")
    @ResponseBody
    public JSONResult delete(Long id){
        if(id!=null){
            productService.delete(id);
        }
        return new JSONResult();
    }

    @RequiredPermission("商品批量删除")
    @RequestMapping("/batchDelete")
    @ResponseBody
    public JSONResult batchDelete(Long[] ids){
        if(ids!=null&&ids.length>0){
            //productService.batchDelete(ids);
        }
        return new JSONResult();
    }

    @RequiredPermission("商品编辑")
    @RequestMapping("/input")
    public String input(Long id,Model model){
        if(id!=null){
            model.addAttribute("product",productService.get(id));
        }
        model.addAttribute("brands",brandService.list());
        return "product/input";
    }

    @RequestMapping("/selectProductList")
    public String selectProductList(@ModelAttribute("qo") ProductQueryObject qo,Model model){
       model.addAttribute("result",productService.query(qo));
        model.addAttribute("brands",brandService.list());
        return "product/selectProductList";
    }

    @RequiredPermission("商品保存或更新")
    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public JSONResult saveOrUpdate(Product product, MultipartFile pic){
        if(pic!=null){
            String fileName = UploadUtil.upload(pic, servletContext.getRealPath("/upload/"));
            product.setImagePath(fileName);
        }
        productService.saveOrUpdate(product);
        return new JSONResult();
    }

}
