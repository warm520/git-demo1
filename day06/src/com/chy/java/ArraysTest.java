package com.chy.java;
/*
 * 二维数组的使用：
 * 1.理解：
 * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个数组array2的元素而存在
 * 其实，从数组底层的运行机制来看，其实没有多维数组
 * 2.
 * 	1.声明和初始化
 *  2.调用
 *  3.数组的长度
 *  4.遍历数组
 *  5.默认初始化方式一：int[][] arr = new int[4][3];
 *  	外层元素的初始化值为：地址值
 *  	内层元素的初始值为：与一维数组初始化情况相同
 *  6.初始化方式二：int[][] arr = new int[4][];
 *  	外层元素的初始值：null
 *  	内层元素的初始值：不能调用，否则报错
 *  7.数组的内存解析：
 *  
 */
public class ArraysTest {
	public static void main(String[] args) {
		//静态初始化
//		int[] arr =new int[]{1,2,3};
//		int[][] arr1 = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
		//动态初始化
//		String[][] arr2 = new String[3][2];//方式1
//		String[][] arr3 = new String[3][];//方式2
		//错误的情况：
		//String[][] arr4 = new String[][2];
		//String[][] arr5 = new String[][];
		
//		System.out.println(arr1[0][1]);//2
//		System.out.println(arr2[1][1]);//null
//		arr3[1] = new String[4];
//		System.out.println(arr1.length);//长度为3
//		System.out.println(arr1[1].length);//长度为2
//		for(int i=0;i<arr1.length;i++)
//		{
//			for(int j=0;j<arr1[i].length;j++)
//			{
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
		String[][] arr = new String[4][];
		System.out.println(arr[0]);//地址值
		System.out.println(arr[0][0]);//null
		System.out.println(arr);//地址值
		
	}

}
