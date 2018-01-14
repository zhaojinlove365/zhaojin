package com._520it.wms.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@Setter
@Getter
@ToString
public class PageResult {
    private int currentPage;
    private int pageSize;
    private List<?> listData;
    private int totalCount;
    private int prePage;
    private int nextPage;
    private int totalPage;
    public static final PageResult EMPTY_RESULT=new PageResult(1,5, Collections.EMPTY_LIST,0);
    public PageResult(int currentPage, int pageSize, List<?> listData, int totalCount) {
        super();
        this.listData = listData;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalPage = this.totalCount % this.pageSize == 0 ? this.totalCount
                / this.pageSize : this.totalCount / this.pageSize + 1;
        this.prePage = this.currentPage - 1 >= 1 ? this.currentPage - 1 : 1;
        this.nextPage = this.currentPage + 1 <= this.totalPage ? this.currentPage + 1
                : this.totalPage;
    }

    public int getTotalPage(){
        return totalPage==0? 1:totalPage;
    }

}
