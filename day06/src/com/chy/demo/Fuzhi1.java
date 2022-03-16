package com.chy.demo;

public class Fuzhi1 {
	public static void main(String[] args) {
		int[] arr =new int[10];
		int sum=0;
		int max=0;
		int min=0;
		double averge =0.0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*9+10);
		}
		max=arr[0];
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		averge = sum/(arr.length);
		System.out.println("总和为: "+sum);
		System.out.println("最大值为: "+max);
		System.out.println("最小值为: "+min);
		System.out.println("平均值为: "+averge);
		
	}

}
