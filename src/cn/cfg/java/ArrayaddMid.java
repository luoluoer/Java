
package cn.cfg.java;

import java.util.Scanner;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��16�� ����9:28:22
*/
public class ArrayaddMid {
	public static void main(String[] args) {
		
		int [] arr = {10,12,45,90};
		int [] addarr = new int[arr.length+1];
		int insertnum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���������");
		insertnum = sc.nextInt();
		for(int i = 0;i<arr.length;i++) {
			if (arr[i]<=insertnum) {
				addarr[i] = arr[i];
			}
			
			
			else {
				addarr[i] = insertnum;
				for(int j = i+1;j<addarr.length;j++,i++) {
					addarr[j] = arr[i];
				}
				
				break;
			}
			
			
		}
		
		
		
		for(int j = 0;j<addarr.length;j++) {
			System.out.print(addarr[j]+"\t");
		}
		
	}
}
