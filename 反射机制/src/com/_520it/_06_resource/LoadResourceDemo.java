package com._520it._06_resource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
//三种加载配置文件的方式：优选第2中方式
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		test1();
		test2();
		test3();
	}
	//方式三：使用相对路径，当前字节码的相对路径:  必须将配置文件、该类java代码放在同一个包中（否则报错）
	private static void test3() throws Exception {
		Properties properties = new Properties();
		InputStream in2=LoadResourceDemo.class.getResourceAsStream("db.properties");
		properties.load(in2);
		System.out.println(properties);
		
	}
	//方式二：使用相对路径classPath根路径
	private static void test2() throws Exception {
		Properties properties = new Properties();
		//获取类加载器
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		//加载成输入流
		InputStream in=loader.getResourceAsStream("db.properties");
		properties.load(in);
		System.out.println(properties);
		
	}
	//方式一：使用绝对路径加载
	private static void test1() throws Exception {
		Properties properties = new Properties();
		InputStream inputStream = new FileInputStream("D:/openSources/javaApps/反射机制/resources/db.properties");
		//加载配置文件
		properties.load(inputStream);
		System.out.println(properties);
	}
}
/*
 * 小结：注意:加载properties文件,只能使用Properties类的load方法。

 * 
 */