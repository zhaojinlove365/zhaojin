package com._520it.wms.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SystemMenu extends BaseDomain{
    private String name;
    private String url;
    private String sn;
    private SystemMenu parent;

}
