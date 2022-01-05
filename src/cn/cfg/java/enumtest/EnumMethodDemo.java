
package cn.cfg.java.enumtest;


/**
* ����Enum��ķ�������
* 1.name(),���������
* 2.ordinal(),������,���,ö�ٱ��
* 3.values(),��������Ƚ�����,����Enum�ķ���,���ڱ���java�ļ�ʱ���ɵ�values()����,ͨ��������Season.class
* �ļ����Կ���,��values()�������..����˵��:EnumDemo.java��������EnumDemo.class��Season.class
* 4.values()�ķ���������Season[] ,�Ǹ�����
* 5.valueOf(),��������ǽ��ַ���ת��ö�ٶ���,Ҫ���ַ�������Ϊ���еĳ�����,�����쳣
* 6.compareTo(),�Ƚ�����ö�ٳ���,�Ƚϵľ��Ǳ��//0��ʾ��ͬ,����ֵ��ʾ��ͬ,��Ϊreturn self.ordinal - other.ordinal;
* @author �񷽹�
* @version ����ʱ�䣺2022��1��5�� ����10:07:12
*/
public class EnumMethodDemo {
	public static void main(String[] args) {
		Season autumn = Season.AUTUMN;
		System.out.println(autumn.name());
		System.out.println(autumn.ordinal());
		System.out.println();
		System.out.println(Season.values());
		
		//��ǿfor��ʼ
		Season[] svalue = Season.values();
		System.out.println(svalue);
		for(Season s :svalue) {
			//System.out.println(s.name());
			System.out.println(s);
		
		}
		//��ǿfor����
		
		Season autumn1 = Season.valueOf("AUTUMN");
		System.out.println("autumn1�Ķ�����"+autumn1);
		System.out.println(autumn1==autumn);//����true ,��Ϊȷʵ��ͬһ������,Season����ֻ��һ��AUTUMN��
		System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));
	}
}
