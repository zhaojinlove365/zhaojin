package com._520it._03_method;

import java.lang.reflect.Method;
//使用反射，获取所有的方法或指定的方法
public class MethodDemo {
	public static void main(String[] args) throws Exception {
		//获取所有的方法
		//getAll();
		//获取指定的一个方法
		getOne();
	}

	private static void getOne() throws Exception {
		Class<Employee> clz=Employee.class;
		//获取无参的doWork方法
		Method method=clz.getMethod("doWork");
		System.out.println(method);
		//获取带一个参数的doWork方法
		Method method2=clz.getMethod("doWork",String.class);
		System.out.println(method2);
		//获取带两个参数的doWork方法
		Method method3 = clz.getDeclaredMethod("sayHello", String.class,int.class);
		System.out.println(method3);
	}
	//获取所有的方法
	private static void getAll() throws Exception {
		Class<Employee> clz=Employee.class;
		//获取所有公共无参的方法，包括父类中继承过来的方法
		Method[] ms=clz.getMethods();
		System.out.println(ms.length);
		for (Method method : ms) {
			System.out.println(method);
		}
		System.out.println("-----------------------------------");
		//获取所有类中（不受访问修饰符限制）的方法
		Method[] ms2=clz.getDeclaredMethods();
		System.out.println(ms2.length);
		for (Method method : ms2) {
			System.out.println(method);
		}
		System.out.println("-----------------------------------");
		//获取指定的方法
		
		
	}
}
//创建一个员工的类，封装几个方法
class Employee{
	public void doWork() {
	}
	public void doWork(String name) {
		
	}
	public String sayHello(String name,int age) {
		return name+"-"+age;
	}
}

/*
 * 小结:都是通过字节码对象获取方法，需要指定获取的方法名称以及方法的参数的字节码对象，才能找到对应的方法对象。
 * 
 */