
package cn.cfg.java;

import java.util.Scanner;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��8�� ����10:16:08
*/
public class ArrayAdd {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		//int len = arr.length;
		int [] arrNew = new int [arr.length+1];
		for (int i = 0;i<arr.length;i++){
			arrNew[i] = arr[i];
		}
		System.out.println("������Ҫ׷�ӵ�����");
		Scanner sc = new Scanner(System.in);
		int im = sc.nextInt();
		arrNew[arr.length] = im;
		arr = arrNew;//arrnew�����ø�ֵ��arr
		for (int i = 0;i<arrNew.length;i++) {
			System.out.print(arrNew[i]+"\t");
			
		}
	}
	
}
