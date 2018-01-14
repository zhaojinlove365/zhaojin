package com._520it._01_class_instance;

//九大内置的Class实例（8大基本类型+void特殊类型）
public class DataTypeClassInstanceDemo {
	// Integer字节码和int字节码是否相同
	public static void main(String[] args) {
		Class<?> clz1 = boolean.class;
		Class<?> clz2 = Integer.class;
		Class<?> clz3 = int.class;
		// 判断Integer（字节码对象）的类型与int（字节码对象）的类型是否相同
		System.out.println(clz2 == clz3); // false
		// 包装类型中有一个常量 用于返回基本类型的字节码对象
		System.out.println(Integer.TYPE == int.class); // true
		dowork();
	}
	//
	private static void dowork() {
		//定义一个一维数组，并初始化
		int[] arr1={1,2,3};	
		Class<?> arr1Class1 = arr1.getClass();
		Class<?> arr1Class2=int[].class;
		//true
		System.out.println(arr1Class1==arr1Class2);
		//定义一个一维数组，并初始化（元素个数与上面数组不同）
		int[] arr2={1,2,3,4,5,6};
		Class<?> arr2Class1 = arr2.getClass();
		Class<?> arr2Class2 = int[].class;
		//true
		System.out.println(arr1Class1==arr2Class1);
		//false  定义一个二维数组
		int[][] arr3={};
		Class<?> arr3Class1=arr3.getClass();
		System.out.println(arr1Class1==arr3Class1);
	}
}
/*
 * 小结：字节码对象就是  对象的类型，如果元素类型和数组维度都相同，字节码对象相同。
 * 		两个条件同时满足时，才认为是同一份字节码对象。
 * 
 */