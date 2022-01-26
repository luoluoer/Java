
package cn.cfg.java.StringBuffer;

import java.util.Scanner;

/**
* 题目要求,字符串数字,每三位插入一个逗号
* 例如123,456,789或者123,456,789.88
* @author 柴方贵
* @version 创建时间：2022年1月25日 下午10:23:01
*/
public class StringBufferExercise {
	public static void main(String[] args) {
		String str = null;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		int i = sb.lastIndexOf(".");
		for (int  j=i;j>0;j-=3) {
			sb.insert(j-3,",");
		}
		System.out.println(sb);
		
	}
}
