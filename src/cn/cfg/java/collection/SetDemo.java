
package cn.cfg.java.collection;

import java.util.*;

/**
* Set  ��ʵ������ѧ�����ϵļ���
* @author �񷽹�
* @version ����ʱ�䣺2022��3��8�� ����10:10:26
*/
public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("hohn");
		set.add("lucy");
		set.add("hohn");
		set.add("make");
		set.add(null);
		set.add(null);
		//��ӡ���Կ���,��ӵ�˳���ȡ����˳��һ��
		//Ԫ�ز����ظ�
		System.out.println(set);
		
		//����set
		Iterator it  = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		//For
		for(Object o :set) {
			System.out.println(o);
		}
		
	}
}
