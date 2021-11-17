
package cn.cfg.java;

/**
* 数组拷贝,不能使用arr1 = arr2;因为这样子是赋值了地址,arr1和arr2
* 都指向了同一个地址
* @author 作者
* @version 创建时间：2021年11月8日 下午9:27:09
* 
*/
public class ArrayCopy {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		int [] b = new int[a.length];
		for (int i = 0;i<a.length;i++) {
			a[i] = b[i];
		}	
	}
	
}
