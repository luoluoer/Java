
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月8日 下午9:34:26
*/
public class ArrayReverse {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int  temp = 0;
		int len = arr.length;
		
		for(int i = 0;i<len/2;i++) {
			temp = arr[len-1-i];
			arr[len-1-i] = arr[i];
			arr[i] = temp;
		}
		System.out.println("反转后的数组");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] + "\t");
		}
	}
}
