package com.chy.demo;

public class Yanghui {
	public static void main(String[] args) {
		//1.声明并初始化二维数组
		int[][] yanghui = new int[10][];
		//2.给元素赋值
		for(int i=0;i<yanghui.length;i++)
		{
			yanghui[i] = new int[i+1];//首先给外层元素开辟数组
			yanghui[i][0] = 1;
			yanghui[i][i] = 1;
			if(i>1)
			{
				for(int j=1;j<yanghui[i].length-1;j++)
				{
					yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
				}
			}
		}
		//3.遍历二维数组
		for(int i=0;i<yanghui.length;i++)
		{
			for(int j=0;j<yanghui[i].length;j++)
			{
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
