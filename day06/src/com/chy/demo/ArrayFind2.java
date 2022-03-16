package com.chy.demo;
/*
 * 二分法查找：
 * 所找数组必须有序
 */
public class ArrayFind2 {
	public static void main(String[] args) {
		int[] arr = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int dest = 54;
		int head=0;
		int end = arr.length-1;
		boolean isFind=true;
		while(head<=end)
		{
			int middle = (head+end)/2;
			if(dest==arr[middle])
			{
				System.out.println("恭喜你找到，位置: "+middle);
				isFind = false;
				break;
			}
			else if(dest>arr[middle])
			{
				head = middle+1;
			}
			else if(dest<arr[middle]) {
				end = middle-1;
			}
			
		}
		if(isFind)
		{
			System.out.println("很遗憾，没找到");
		}
	}

}
