package com._520it._03_method;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
//使用反射，操作静态方法（数组参数/可变参数）的调用
class Employee2{
	public static void doWork(int...arr){
		System.out.println("打印数组"+Arrays.toString(arr));
	}
	public static void doWork(String...arr){
		System.out.println("打印数组"+Arrays.toString(arr));
	}
	@SuppressWarnings("unused")
	private String sayGoodbye(String name,int age){
		System.out.println("打印数组"+name+"--"+age);
		return name+"--"+age;
	}
	 public static <T> List<T> asList(T... a) {
	        return null;
	    }
	
}
public class MethodInvokeDemo2 {
	public static void main(String[] args) throws Exception {
		Class<Employee2> clz4=Employee2.class;
		//获取指定的方法（注意：泛型T类型的数组，底层是Object[]）
		Method m6=clz4.getMethod("asList", Object[].class);
		System.out.println(m6);
		
		Class<Employee2> clz3=Employee2.class;
		Method m3=clz3.getMethod("doWork",int[].class);
		//调用的是静态的方法，可不用对象调用
		m3.invoke(null, new Object[]{new int[]{1,2,3,4}});
		System.out.println(m3);
		//获取指定参数和方法名的方法对象
		Method m4 = clz3.getMethod("doWork", String[].class);
		//调用方法，传递实参（注意：可变参数是Object数组，会将传递过去的实参拆包，单纯字符串数组拆包后会变成多个对象）
		m4.invoke(null, new Object[]{new String[]{"A","B","C"}});
		System.out.println(m4);
		//----------------获取私有的方法--------------------------------------
		Method m5 = clz3.getDeclaredMethod("sayGoodbye", String.class,int.class);
		//设置方法对象为可访问的
		m5.setAccessible(true);
		Object obj = m5.invoke(clz3.newInstance(),new Object[]{"黎明",19});
		System.out.println(m5);
	}
}

/*
 * 小结：通过反射调用方法，给方法传递实参，而形参是可变数组   时，形参会将传递的实参进行拆包处理，
 * 		所以使用王道：在外面包装一层：new Object[]{ 传递的任意类型的数组 }解决，
 * 		而 new int[]{1,2}会自动装箱，可不用包装，包装也不会错。
 * 		注意：泛型T类型的数组，底层是Object[]。
 * 
 */