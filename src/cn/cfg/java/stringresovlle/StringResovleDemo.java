
package cn.cfg.java.stringresovlle;

import java.util.Scanner;

/**
* �÷������ڷ�ת�ַ���,���罫abcdef   תΪ  aedcbf
* @author �񷽹�
* @version ����ʱ�䣺2022��2��15�� ����10:20:03
*/
public class StringResovleDemo {
	public static void main(String[] args) {
		String string = null;
		Scanner scanner = new Scanner(System.in);
		string  = scanner.next();
		String  result = reverse(string,1,string.length()-2);
		
	}
	
	
	public static String reverse(String str, int start,int end) {
		char temp = ' ';//��������
		char[] chars = str.toCharArray();//String תchar[] 
		for(int i = start,j = end;i<j;i++,j--) {
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		System.out.println(chars);
		
		//�������chars���¹���һ��String
		return new String(chars);
	}
}
