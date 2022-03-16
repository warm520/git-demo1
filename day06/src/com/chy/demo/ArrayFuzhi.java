package com.chy.demo;

public class ArrayFuzhi {
	public static void main(String[] args) {
		int[] array1,array2,array3;
		array1 = new int[]{2,3,5,7,11,13,17,19};
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		array2 = array1;//不能成为数组的复制，相当于创建快捷方式
		array3 = new int[array1.length];
		for(int i=0;i<array1.length;i++)
		{
			array3[i]=array1[i];
		}
		for(int i=0;i<array2.length;i++)
		{
			if(i%2==0)
			{
				array2[i]=i;
				
			}
		}
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+"\t");
		}
	}

}
