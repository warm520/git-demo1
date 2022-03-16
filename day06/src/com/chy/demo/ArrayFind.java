package com.chy.demo;

public class ArrayFind {
	public static void main(String[] args) {
		String dest = "BB";
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		boolean isFind = true;
		for(int i=0;i<arr.length;i++)
		{
			if(dest.equals(arr[i]))
			{
				System.out.println("找到了指定位置: "+i);
				isFind = false;
				break;
			}
		}
		if(isFind)
		{
			System.out.println("很遗憾，没有找到的!");
		}
		
	}

}
