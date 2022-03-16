package com.chy.demo;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int Student_num = scan.nextInt();
		//给数组元素赋值
		System.out.println("请输入5个成绩：");
		int[] scores = new int[Student_num];
		for(int i=0;i<scores.length;i++)
		{
			scores[i]=scan.nextInt();
		}
		//求数组元素的最大值
		int maxscore=0;
		for(int i=0;i<scores.length;i++)
		{
			if(scores[i]>maxscore)
			{
				maxscore=scores[i];
			}
		}
		//计算成绩与最高分的差值:
		char level;
		for(int i=0;i<scores.length;i++)
		{
			if(maxscore-scores[i]<=10)
			{
				level = 'A';
			}
			else if(maxscore-scores[i]<=20)
			{
				level='B';
			}
			else if(maxscore-scores[i]<=30)
			{
				level='C';
			}
			else
			{
				level='D';
			}
			System.out.printf("Student %d score is %d grade is %c\n",i,scores[i],level);
		}
	}

}
