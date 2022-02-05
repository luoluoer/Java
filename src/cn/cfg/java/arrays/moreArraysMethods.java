
package cn.cfg.java.arrays;

import java.util.*;
import java.util.Arrays;

/**
* Arrays���һЩ���÷���
* @author �񷽹�
* @version ����ʱ�䣺2022��2��5�� ����11:00:58
*/
public class moreArraysMethods {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,20,50,90};
		//1.�������,Ҫ�������������;�������������Ĳ���ʹ��binarySearch;
		//���ڷ�������,�����ڷ��ظ���;return -(low + 1);Ӧ���ڵ�λ��,��һ,ȡ��
		int index = Arrays.binarySearch(arr,1);
		System.out.println(index);
		
		
		//2.copyOf,����ĸ���
		//��arr����,����arr.length�����鵽newInteger��
		//newInteger ��arr����ͬһ������
		Integer[] newInteger = Arrays.copyOf(arr,arr.length);
		System.out.println(arr);
		System.out.println(newInteger);
		
		System.out.println(newInteger);
		//3.fill�滻����Ԫ��
		Integer[] num = new Integer[] {1,2,3};
		Arrays.fill(num,99);
		System.out.println( Arrays.toString(num));
		
		//4.equals,�Ƚ���������,�Ƿ���ȫһ��;ֻ�Ƚ�����,���Ƚϵ�ַ
		
		Integer[] arr2 = {1,2,3,20,50,90};
		
		System.out.println(Arrays.equals(arr,arr2));
		
		//5.asList����,������ת��List����
		List asList =  Arrays.asList(2,3,4,5,6);
		System.out.println("asList= "+asList);
		System.out.println("asList���������� "+asList.getClass());
		
	}

}
