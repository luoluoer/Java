
package cn.cfg.java;

/**
* ���鿽��,����ʹ��arr1 = arr2;��Ϊ�������Ǹ�ֵ�˵�ַ,arr1��arr2
* ��ָ����ͬһ����ַ
* @author ����
* @version ����ʱ�䣺2021��11��8�� ����9:27:09
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
