package com._520it._02_constuctor;

import java.lang.reflect.Constructor;

//获取所有构造器、指定参数的构造器
public class GetConstructorDemo {
	public static void main(String[] args) throws Exception {
		//getAll();
		getOne();
	}
	//----------------获取所有的构造器对象-------------------------------
	private static void getAll() {
		Class<User> clz=User.class;	
		//打印字节码对象（全限定类名）
		System.out.println(clz);
		Constructor<?>[] constructors = clz.getDeclaredConstructors();
		System.out.println(constructors.length);
		//打印所有类中的构造器
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("--------------------------------------");
		//获取所有公共的构造器
		Constructor<?>[] constructors2=clz.getConstructors();
		for (Constructor<?> constructor : constructors2) {
			System.out.println(constructor);
		}
	}
	//------------------获取指定的那个构造器对象------------------------
	private static void getOne() throws Exception {
		Class<User> clz2=User.class;	
		Constructor<User> constructor1=clz2.getConstructor();
		System.out.println(constructor1);
		Constructor<User> constructor2=clz2.getConstructor(String.class);
		System.out.println(constructor2);
		//获取不受访问权限  限制的指定参数构造器
		Constructor<User> constructor3=clz2.getDeclaredConstructor(String.class,int.class);
		System.out.println(constructor3);
	}
}
//定义一个User类
@SuppressWarnings("all")
class User{
	public User(){
	}
	public User(String name){
	}
	
	private User(String name,int age){
	}
	
}

/*
 *小结：反射可以拿到私有化的构造器，可以创建对象，破坏封装。 
 *		getDeclaredConstructor(“参数类型的字节码对象”);获取与访问权限无关的构造器。
 * 
 */