package com.chy.java;
/**
 * 
 * @Description
 * @author chy 
 * @Email:2145632023@qq.com
 * @version
 * @date
 */
/*
1.数组：是多个相同数据按照一定顺序排列的集合，并使用同一个名字命名，并通过编号的方式
对这些数据进行管理。
2.数组相关概念：
	数组名
	元素
	下标/索引
	数组的长度
3.数组特点：
	数组是有序排列的
	数组本身是引用数据类型（接口，类），但数组中的数据可以是任何数据类型
	创建数据对象会在内存中开辟一块连续的空间，数组名引用的是这块连续空间的首地址
	数组长度确定后不可以修改
4.数组的分类：
	一维数组，二维数组，....多维数组
	按照数组元素的类型：基本数据类型的元素，引用数据类型的元素
	数组的声明与初始化：初始化完成后，数组的长度确定；
	数组调用：通过下标方式调用,数组下标从0开始
	数组的长度：length	
	遍历数组元素：
	数组元素的默认初始化值：
		整形：0
		浮点型：0.0
		char型：0或'\u0000';
		boolean:false
		String:null
	数组的内存解析：
	栈(stack)：局部变量(放在方法中的变量都叫局部变量)
	堆：(heap):new出来的结构：对象，数组
	方法区：	常量池
			静态域
*/
public class ArrayTest{
	public static void main(String[] args) {
		//int[] ids;//声明
		//1.1:静态初始化:数组初始化和数组元素的赋值操作同时进行
		//ids = new int []{1001,1002,1003,1004};
		//1.2动态初始化：数组初始化和数组元素的赋值操作分开进行
		//String[] names = new String[5];
		//错误的写法：
		//int[] arr1 = new int[];
		//int[5] arr2=new int[5];
		//int[] arr3=new int[3]{1,2,3};
//		names[0]="李白";
//		names[1]="杜甫";
//		names[2]="李贺";
//		names[3]="陆游";//charAt(0)
//		names[4]="辛弃疾";
//		System.out.println(names.length);
//		System.out.println(ids.length);
//		for(int i=0;i<names.length;i++)
//		{
//			System.out.println(names[i]);
//		}
//		int[] arr = new int[4];
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		System.out.println("*************");
//		short[] arr1 = new short[4];
//		for(int i=0;i<arr1.length;i++)
//		{
//			System.out.println(arr1[i]);
//		}
//		System.out.println("*************");
//		float[] arr2 = new float[5];
//		for(int i=0;i<arr2.length;i++)
//		{
//			System.out.println(arr2[i]);
//		}
//		char[] arr3 = new char[4];
//		for(int i=0;i<arr3.length;i++)
//		{
//			System.out.println("----"+arr3[i]+"-----");
//		}
//		boolean[] arr4 = new boolean[4];
//		for(int i=0;i<arr4.length;i++)
//		{
//			System.out.println(arr4[i]);
//		}
		
}
}
