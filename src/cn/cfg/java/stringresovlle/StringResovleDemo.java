
package cn.cfg.java.stringresovlle;

import java.util.Scanner;

/**
* 该方法用于翻转字符串,例如将abcdef   转为  aedcbf
* @author 柴方贵
* @version 创建时间：2022年2月15日 下午10:20:03
*/
public class StringResovleDemo {
	public static void main(String[] args) {
		String string = null;
		Scanner scanner = new Scanner(System.in);
		string  = scanner.next();
		String  result = reverse(string,1,string.length()-2);
		
	}
	
	
	public static String reverse(String str, int start,int end) {
		char temp = ' ';//辅助交换
		char[] chars = str.toCharArray();//String 转char[] 
		for(int i = start,j = end;i<j;i++,j--) {
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		System.out.println(chars);
		
		//交换后的chars重新构建一个String
		return new String(chars);
	}
}
