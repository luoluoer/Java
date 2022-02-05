
package cn.cfg.java.arrays;

import java.util.*;
import java.util.Arrays;

/**
* Arrays类的一些常用方法
* @author 柴方贵
* @version 创建时间：2022年2月5日 下午11:00:58
*/
public class moreArraysMethods {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,20,50,90};
		//1.二叉查找,要求数组是升序的;如果数组是无序的不能使用binarySearch;
		//存在返回索引,不存在返回负数;return -(low + 1);应该在的位置,加一,取负
		int index = Arrays.binarySearch(arr,1);
		System.out.println(index);
		
		
		//2.copyOf,数组的复制
		//将arr数组,拷贝arr.length的数组到newInteger中
		//newInteger 和arr不是同一个数组
		Integer[] newInteger = Arrays.copyOf(arr,arr.length);
		System.out.println(arr);
		System.out.println(newInteger);
		
		System.out.println(newInteger);
		//3.fill替换所有元素
		Integer[] num = new Integer[] {1,2,3};
		Arrays.fill(num,99);
		System.out.println( Arrays.toString(num));
		
		//4.equals,比较两个数组,是否完全一样;只比较内容,不比较地址
		
		Integer[] arr2 = {1,2,3,20,50,90};
		
		System.out.println(Arrays.equals(arr,arr2));
		
		//5.asList方法,将数据转成List集合
		List asList =  Arrays.asList(2,3,4,5,6);
		System.out.println("asList= "+asList);
		System.out.println("asList的运行类型 "+asList.getClass());
		
	}

}
