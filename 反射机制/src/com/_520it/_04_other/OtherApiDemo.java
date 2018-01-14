package com._520it._04_other;

import java.lang.reflect.Modifier;
//定义一个枚举类
enum Gender{
	MAN,WOMAN,NONE
}
//通过反射获取类的相关信息（修饰符）
public class OtherApiDemo {
	public static void main(String[] args) throws Exception {
		Class<OtherApiDemo> clz=OtherApiDemo.class;
		//获取修饰符
		int m = clz.getModifiers();
		//1
		System.out.println(m);
		String mod = Modifier.toString(m);
		//public
		System.out.println(mod);
		//com._520it._04_other.OtherApiDemo
		System.out.println(clz.getName());
		//获取字节码对象的类名：OtherApiDemo
		System.out.println(clz.getSimpleName());
		//获取包的全名  com._520it._04_other
		System.out.println(clz.getPackage().getName());
		//获取字节码对象超类的全限定名：class java.lang.Object
		System.out.println(clz.getSuperclass());
		//枚举字段的字节码对象：class com._520it._04_other.Gender$1
		System.out.println(Gender.MAN.getClass());
		//枚举类中的对象，是static final 修饰的常量，不能使用反射创建对象
		//System.out.println(Gender.MAN.getClass().newInstance()); //ERROR 报错
	}
}
/*
 * 小结：1.枚举中的对象不能使用反射来获取。
 * 		2.通过字节码对象可获取类的修饰符，但底层是以整数类型的常量表示的，
 * 		      使用修饰符的类Modifier.toString(int 修饰符常量)，可以将修饰符底层的整形常量，以字符串形式返回。
 */