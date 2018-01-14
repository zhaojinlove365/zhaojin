package com._520it.wms.domain;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//货品
@Setter
@Getter
public class Product extends BaseDomain{
    private String name;
    private String sn; //货品编码
    private BigDecimal costPrice;
    private BigDecimal salePrice;
    private String imagePath; //货品图片
    private String intro;
    //品牌id
    private Long brandId;
    //品牌名称
    private String brandName;

    //返回当前货品对象的json格式数据
    public String getJsonString(){
        Map<String, Object> jsonString = new HashMap<>();
        jsonString.put("id",id);
        jsonString.put("name",name);
        jsonString.put("costPrice",costPrice);
        jsonString.put("salePrice",salePrice);
        jsonString.put("brandName",brandName);
        return JSON.toJSONString(jsonString);
    }

    //获取小图路径
    // 如大图 ：/upload/1.jpg    小图：/upload/1_smal.jpg
     public String getSmallImagePath(){
         if(imagePath==null){
             return "";
         }
         return imagePath.substring(0,imagePath.lastIndexOf('.'))+"_small"
                 +imagePath.substring(imagePath.lastIndexOf('.'));
     }

}
