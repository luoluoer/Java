
package cn.cfg.javacollection;

//import java.util.ArrayList;
import java.util.*;

/**
*add  �������Ԫ��
*remove ɾ��Ԫ��
*contains ����Ԫ���Ƿ����
*size��ȡԪ�ظ���
*isEmpty�ж��Ƿ�Ϊ��
*clear ���
*addAll ��Ӷ��Ԫ��
*containsAll ���Ҷ��Ԫ���Ƿ����
*removeAll ɾ�����Ԫ��
* @author �񷽹�
* @version ����ʱ�䣺2022��2��21�� ����10:01:53
*/
public class CollectionMethod {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add(10);
		list.add(true);
		System.out.println(list);
		list.remove(0);//ɾ����һ��Ԫ��
		System.out.println(list);
		//list.remove("jack");//ָ��ɾ���Ķ���
		
		System.out.println(list.contains("jack"));//�ж�Ԫ���Ƿ����
		System.out.println(list.size());//Ԫ�صĸ���
		System.out.println(list.isEmpty());//�ж��Ƿ�Ϊ��
		list.clear();//���list
		System.out.println(list);
		
		List list2 = new ArrayList();
		list2.add("��¥��");
		list2.add("��������");
		list.addAll(list2);//��list2ȫ����ӵ�list
		System.out.println(list);
		System.out.println(list.containsAll(list2));//�ж�����Ԫ���Ƿ����,������collection
		list.add("��ի");
		list.removeAll(list2);//��list��ɾ��list2������Ԫ��
		System.out.println(list);
		
		
		
		
		
		
	}
}
