package com._520it._03_method;

import java.lang.reflect.Method;
//通过反射获取方法，进行方法调用的操作演示
class Person{
	public void doWork(){
		System.out.println("调用无参数的方法");
	}
	public static void doWork(String name){
		System.out.println("调用参数的方法-"+name);
	}
	@SuppressWarnings("unused")
	private String sayHello(String name,int age){
		return "调用参数的方法-"+name+", "+age;
	}
}
public class MethodInvokeDemo {
	public static void main(String[] args) throws Exception {
		//获取字节码对象
		Class<Person> clz=Person.class;
		Method m1=clz.getMethod("doWork");
		//调用无参数的方法
		m1.invoke(clz.newInstance());
		System.out.println(m1);
		//获取指定方法名和参数列表的方法
		Method m2=clz.getMethod("doWork",String.class);
		//调用静态的方法，该方法属于类，不能对象调用，设为null
		m2.invoke(null, "泥菩萨过江");
		System.out.println(m2);
		Method m3=clz.getDeclaredMethod("sayHello",String.class,int.class);
		//要传递实参到私有的方法中，必须设置为可访问
		m3.setAccessible(true);
		Object ret=m3.invoke(clz.newInstance(),"风云合并",19);
		System.out.println(ret);
		System.out.println(m3);
		//创建一个日期对象
		Object obj=new java.util.Date();
		Class clz2=obj.getClass();
		//获取日期字节码对象中指定的方法
		Method method2=clz2.getMethod("toLocaleString");
		Object strObject=method2.invoke(obj);
		System.out.println(strObject);
		
	}
}
/*
 * 小结：当需要向私有化的方法中，通过反射出对象来调用该方法时，必须将该方法对象设置为可访问的，
 * 		这样才能通过对象传递实参到该方法，并调用。
 * 		使用invoke方法返回的是Object类型。
 * 
 */



