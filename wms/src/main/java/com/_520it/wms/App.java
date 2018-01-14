package com._520it.wms;

import org.junit.Test;
import com.alibaba.druid.filter.config.ConfigTools;

public class App {
    //lCzd9geWAuAuJtLhpaG/J+d28H8KiMFAWopxXkYpMNdUai6Xe/LsPqMQeg5MIrmvtMa+hzycdRhWs29ZUPU1IQ==
    @Test //druid数据库加密
    public void testConfigTools()throws Exception{
        String pwd = ConfigTools.encrypt("admin");
        System.out.println("pwd = " + pwd);
    }

}
