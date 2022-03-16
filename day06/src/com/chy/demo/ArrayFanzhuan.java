package com.chy.demo;

public class ArrayFanzhuan {
	public static void main(String[] args) {
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		String str;
		for(int i=0;i<arr.length/2;i++)
		{
			str = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=str;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
