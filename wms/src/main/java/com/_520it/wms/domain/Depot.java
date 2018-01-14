package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Depot extends BaseDomain{
    private String name; //仓库名称
    private String location;//仓库所在地
}
