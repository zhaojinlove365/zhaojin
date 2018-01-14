package com._520it._01_class_instance;


//获取字节码对象：Class对象
public class ClassInstanceDemo {
	public static void main(String[] args) throws Exception {
		//需求：获取java.util.Date类的字节码对象
		//方式一：全限定名.class
		Class<java.util.Date> clz1=java.util.Date.class;
		//方式二：类对象.getClass()
		java.util.Date date = new java.util.Date();
		Class<?> clz2=date.getClass();
		//方式三：Class.forName("全限定类名")
		Class<?> clz3=Class.forName("java.util.Date");
		//打印字节对象（全限定类名）
		System.out.println(clz1);
		//判断同一个类的字节码对象是否相同。
		System.out.println(clz1==clz2);
		System.out.println(clz2==clz3);
	}
}

/*
 *小结：同一个类在JVM中只存在同一份字节码对象。 
 * 
 */