
package cn.cfg.java.arrays;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Comparator;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��1��26�� ����10:33:34
*/
public class ArrayMethodDemo {
	public static void main(String[] args) {
		//֮ǰ���Ҫ��ʾ������ÿ��ֵ����Ϣ,ֻ��ʹ��ѭ��
		Integer[] i  = {1,20,90 };
		Integer[] arr = {30,10,20};
		//Arrays��д��toString����,����ֱ����ʾ����
		System.out.println(Arrays.toString(i));
		Arrays.sort(arr);
		//1.Arrays��sort�������Ը���������,
		//2.sort()���Դ���commaratorʵ�ֶ�������
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer i1 = (Integer)o1;
				Integer i2 = (Integer)o2;
				System.out.println("i1��"+i1);
				System.out.println("i2��"+i2);
				return i2-i1;//�˴��ķ���ֵ��ֱ��Ӱ������˳��,��Ϊ�ײ������ж�compare�ķ���ֵ
				//��ʵ����ֱ��ʹ��1��-1����������˳��,1����,-1����
			}
			
		});
		System.out.println("ͨ�������ڲ��� �����");
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
