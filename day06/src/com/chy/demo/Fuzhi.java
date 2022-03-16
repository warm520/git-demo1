package com.chy.demo;
/*
 * 数组常见的算法：
 * 	1.数组元素的赋值：
 */
public class Fuzhi {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*30)+1;
			//System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						do
						{
							arr[j]=(int)(Math.random()*30)+1;
						}while(arr[i]==arr[j]);
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
