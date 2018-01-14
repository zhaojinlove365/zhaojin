package com._520it._02_constuctor;
//使用反射，获取构造器，创建对象，并操作指定的
import java.lang.reflect.Constructor;
//创建一个人的类
@SuppressWarnings("all")
class Person{
	public Person(){
		System.out.println("无参构造器");
	}
	public Person(String name){
		System.out.println("构造器"+"-"+name);
	}
	private Person(String name,int age){
		System.out.println("构造器"+"-"+name+","+age);
	}
}
public class CreateObjectDemo {
	public static void main(String[] args) throws Exception {
		Class<Person> clz=Person.class;
		//获取无参数的公共构造器对象
		Constructor<Person>constructor=clz.getConstructor();
		constructor.newInstance();
		//获取带一个参数的公共构造器对象
		constructor=clz.getConstructor(String.class);
		//创建对象并传递参数
		constructor.newInstance("刘德华");
		//获取构造器所在类的对象
		constructor=clz.getDeclaredConstructor(String.class,int.class);
		//设置构造器对象是可以访问的
		constructor.setAccessible(true);
		//调用构造器，传递参数
		constructor.newInstance("张学友",56);
	}
}
/*
 *小结：只能通过字节码对象获取   字节码对象中的   构造器对象， 
 *	         如果是私有化的构造器，使用指定的getDeclaredXXX方法，如果传递参数，
 *	         必须设置为可访问.setAccessible(true)。
 * 
 */