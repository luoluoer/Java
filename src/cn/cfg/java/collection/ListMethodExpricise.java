
package cn.cfg.java.collection;

import java.util.*;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��6�� ����6:35:37
*/
/*���10�����ϵ�Ԫ��(��String "hello"),
 * ��2��λ���һ��"�񷽹�" ,ȡ�������Ԫ��,ɾ��������Ԫ��,�޸ĵ�7��Ԫ��,ʹ�õ���������
 * Ҫ��ʹ��List��ʵ����ArrayList���
 * */
public class ListMethodExpricise {
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i = 0;i<12;i++) {
			list.add("hellow"+i);
		}
		System.out.println(list);
		
		list.add(2,"�񷽹�");
		System.out.println(list.get(4));
		list.remove(5);
		list.set(6,"zhx");
		System.out.println(list);
		//��������1
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//��������2
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//��������3
		for(Object o :list) {
			System.out.println(o);
		}
		
	}
}
