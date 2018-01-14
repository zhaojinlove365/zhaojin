package com._520it._05_array;

import java.lang.reflect.Array;
import java.util.Arrays;
//使用反射操作数组拷贝
public class ArrayDemo {
	public static void main(String[] args) {
		/*
		 * Object arr=new int[]{1,2,4,6,7}; //使用反射 包中 Array类 ，把索引为2的元素设置为100
		 * Array.set(arr,2,100); //获取索引为2的元素 int ele=Array.getInt(arr, 2);
		 * System.out.println(ele);
		 */
		int[] src = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));
		// 把源数组中第2个索引，长度为5个元素，拷贝到目标数组索引为4的位置
		arraycopy(src, 3, dest, 2, 5);
		//[0, 0, 4, 5, 6, 7, 8, 0, 0, 0]
		System.out.println(Arrays.toString(dest));
	}
	
	public static void arraycopy(Object src, int srcPos, Object dest,
			int destPos, int length) {
		if (src == null || dest == null) {
			throw new NullPointerException("源数组和目标数组都不能为null");
		}
		//源索引位置，目标索引位置，拷贝个数（长度）<0
		if (srcPos < 0 || destPos < 0 || length < 0
				//源索引+拷贝个数>源数组的长度
				|| srcPos + length > Array.getLength(src)
				//目标索引+拷贝个数>目标索引长度
				|| destPos + length > Array.getLength(dest)) {
			throw new IndexOutOfBoundsException("索引越界");
		}
		if (src.getClass().getComponentType() != dest.getClass()
				.getComponentType()) {
			throw new ArrayStoreException("源和目标元素类型必须相同");
		}
		for(int index=srcPos;index<srcPos+length;index++){
			//获取要拷贝的元素、
			Object obj = Array.get(src, index);
			//给目标数组的索引设置元素
			Array.set(dest, destPos, obj);
			destPos++;
		}
	}
}
/*
 * 小结：Array类是反射包中，使用get()方法，获取 指定数组的指定索引的元素。
 * 		Array.set()方法,给目标数组的索引设置元素，每次设置一个元素，目标索引自增1。
 */