
package cn.cfg.java.collection;

import java.util.*;

/**
* �����ĵ�ע��
* List�������е�Ԫ������,�ҿ��ظ�
* List�����е�ÿ��Ԫ�ض���������֧������ȡֵ
* List������Ԫ��
* JKD��List�ӿڵĳ���ʵ��������Vector ArrayList linkedList
* @author �񷽹�
* @version ����ʱ�䣺2022��3��5�� ����10:29:04
*/
public class ListMethod {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add("jack");
		list.add("mack");
		List list2 = new  ArrayList();
		list2.add("1");
		list2.add("11");
		list2.add("111");
		//1.list����ֵ��Ӧ��Ԫ��
		System.out.println( list.get(2));
		//2.list ָ��λ�����Ԫ��
		list.add(1,"cfg");
		System.out.println(list);
		//3.addAll(index,list),��list��ӵ�Դlist��ָ��λ��
		//3.addAll(list)��list��ӵ�Դlist
		list.addAll(1,list2);
		System.out.println(list);
		//4.�ڼ������״γ��ֵ�λ��
		System.out.println(list.indexOf("cfg"));
		//5.�ڼ��������һ�γ��ֵ�����
		System.out.println(list.lastIndexOf("jack"));
		//6.�Ƴ�ĳ��λ���ϵ�Ԫ��
		list.remove(1);
		System.out.println(list);
		//7.�޸�ĳ�������ϵ�Ԫ��
		list.set(1,"111111");
		System.out.println(list);
		
		//8.sublist���ش�fromindex��toindexλ�õļ���,ǰ�պ�
		List list_sub = list.subList(0,2);
		System.out.println(list_sub);
	}
}
