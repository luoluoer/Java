
package cn.cfg.java.ExceptionDemo;

import java.util.Scanner;

/**
* �쳣������Ƶ�������,���򲻱���,������������
* �쳣��Ϊ������쳣����,������ǲ��ܼ������еĽ�������
* �쳣�ַ�Ϊ����ʱ�쳣��ִ��ʱ�쳣����
* ����ִ��ʱ�쳣:nullpointerexception arithmeticexception arrayindexoutofboundsexception
* classcastexception stackoverflowexception
* @author �񷽹�
* @version ����ʱ�䣺2022��1��11�� ����10:19:19
*/
public class ExceptionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		double result = 0.0;
		System.out.println("�����뱻����");
		num2 = new Scanner(System.in).nextInt();
		try {
			result = num1/num2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("�������ִ��");
		
		
		
	}
}
