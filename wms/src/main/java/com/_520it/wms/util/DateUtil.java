package com._520it.wms.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类，获取截止当天最后一秒
 */
public class DateUtil {

    //获取指定时间那一天的最后一秒
    public static Date getEndDate(Date now){
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.set(Calendar.HOUR_OF_DAY,23);
        c.set(Calendar.MINUTE,59);
        c.set(Calendar.SECOND,59);
        return c.getTime();
    }

   public static void main(String[] args) {

        System.out.println(getEndDate(new Date()));

    }
}
