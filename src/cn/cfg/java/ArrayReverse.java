
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��8�� ����9:34:26
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
		System.out.println("��ת�������");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] + "\t");
		}
	}
}
