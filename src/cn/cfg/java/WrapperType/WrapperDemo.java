
package cn.cfg.java.WrapperType;

import cn.cfg.java.InterfaceTest;

/**
* char ---character
* boolean --- Boolean
* byte --- Byte
* short ---short
* int --- Interger
* long --- Long
* float ---Float
* double --- Double
* ���������������װ���͵�ת��,jdk1.5֮ǰ�ֶ�װ�����   jdk1.5�Ժ��Զ�����װ��
* @author �񷽹�
* @version ����ʱ�䣺2022��1��20�� ����10:43:41
*/
public class WrapperDemo {
	public static void main(String[] args) {
		//int��integer�Ĳ��� װ��
		//1.�ֶ�װ��,���ַ�ʽ
		int n1 = 100;
		
		 Integer integer = new Integer(n1);
		 Integer integer1 = Integer.valueOf(n1);
		 System.out.println(integer);
		 //2.�ֶ�����
		 int i = integer.intValue();
		 
		 //�Զ�װ��
		 int n2 = 200;
		 Integer integer2 = n2;
		 //�Զ�����
		 int n3 = integer2;
		 
		 //������װ����÷�����
		 //��װ��->String 
		 //����1
		 Integer ii = 100;
		 String str = ii+"";
		 //����2
		 String str2 = ii.toString();
		 //����3
		 String str3 = String.valueOf(ii);
		 
		 //String ->��װ��(Integer)
		 //����1
		 String strr = "123456";
		 Integer num1 = Integer.parseInt(strr);//parseInt���� int,Ȼ���Զ�װ��
		 //����2
		 Integer num2 = new Integer(strr);
		 char  s = "aaa".charAt(1);
		 
		 
		 
		 
		 
		 
	}
}
