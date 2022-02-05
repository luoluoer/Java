
package cn.cfg.java.arrays;

import java.util.Arrays;
import java.util.*;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年1月28日 下午10:15:21
*/
public class ArraysSortCustom {
	public static void main(String[] args) {
		
		int[] arr = {1,-1,8,0,20};
		bubble01(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		bubble01(arr,new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i2-i1;//return i2-i1
			}

		});
		
		
		System.out.println(Arrays.toString(arr));
		

		
		
		
		
		
		
	}
	
	public static void bubble01(int[] arr) {
		int temp = 0;
		//下面是冒泡排序,如果不懂,可以查看SortMethod文件代码解释
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				//从小到大排序
				if(arr[j]>arr[j+1]) {
					temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	
	//冒泡+定制 
	//重载一个buble01,也有两个参数
	public static void bubble01(int[] arr,Comparator c) {
		int temp = 0;
		//下面是冒泡排序,如果不懂,可以查看SortMethod文件代码解释
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				//从小到大排序
				//int[] arr = {1,-1,8,0,20};
				if(c.compare(arr[j],arr[j+1])>0) {
					temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
}
