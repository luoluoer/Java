
package cn.cfg.java.StringBuffer;

import java.util.Scanner;

/**
* ��ĿҪ��,�ַ�������,ÿ��λ����һ������
* ����123,456,789����123,456,789.88
* @author �񷽹�
* @version ����ʱ�䣺2022��1��25�� ����10:23:01
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
