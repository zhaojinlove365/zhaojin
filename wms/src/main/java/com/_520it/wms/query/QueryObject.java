package com._520it.wms.query;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by John on 2017/10/13.
 */
public class QueryObject {
    @Setter
    @Getter
    protected int currentPage=1;
    @Setter
    @Getter
    protected int pageSize=5;

    public int getStart(){
        return (currentPage-1)*pageSize;
    }

    //把空字符串转成 null
    public String empty2null(String str){
        return hasLength(str)? str:null;
    }

    public boolean hasLength(String str){
        return str!=null && !"".equals(str.trim());
    }


}
