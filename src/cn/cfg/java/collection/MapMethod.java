
package cn.cfg.java.collection;


import java.util.*;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��16�� ����10:46:37
*/
public class MapMethod {
//put  get size clear
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("�˳�","��ٳ");
		map.put("����ǿ","����");
		map.put("�Ά�","����");
		map.put("���貨",null);
		map.put(null,"�����");
		map.put("¹��","����ͮ");
		
		//������ʽ1:
		//��ȡ�����е�key
		Set keyset = map.keySet();
		System.out.println(keyset);
		//���е���
		for(Object key:keyset) {
			System.out.println(key+"---"+map.get(key));
		}
		//ͨ��������,����key
		Iterator it = keyset.iterator();
		System.out.println("������ʽ2");
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key+"---"+map.get(key));
		}
	}
}
