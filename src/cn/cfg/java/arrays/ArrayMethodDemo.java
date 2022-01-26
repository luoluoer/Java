
package cn.cfg.java.arrays;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Comparator;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年1月26日 下午10:33:34
*/
public class ArrayMethodDemo {
	public static void main(String[] args) {
		//之前如果要显示数组中每个值的信息,只能使用循环
		Integer[] i  = {1,20,90 };
		Integer[] arr = {30,10,20};
		//Arrays重写的toString方法,可以直接显示数组
		System.out.println(Arrays.toString(i));
		Arrays.sort(arr);
		//1.Arrays的sort方法可以给数组升序,
		//2.sort()可以传入commarator实现定制排序
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer i1 = (Integer)o1;
				Integer i2 = (Integer)o2;
				System.out.println("i1是"+i1);
				System.out.println("i2是"+i2);
				return i2-i1;//此处的返回值会直接影响排序顺序,因为底层代码会判断compare的返回值
				//其实可以直接使用1和-1来控制排序顺序,1正序,-1倒序
			}
			
		});
		System.out.println("通过匿名内部类 排序后");
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
