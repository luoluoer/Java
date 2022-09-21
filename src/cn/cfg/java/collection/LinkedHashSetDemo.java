
package cn.cfg.java.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet�ײ�ά������һ��LinkedHashMap,�����HashSet��ͨ
* LinkedHashSet��˫���,�������൱����HashSet�����˫������
* ��LinkedHashSet��ά����һ��Hash���˫������(LinkedHashSet��head��tail)
* ûһ���ڵ���before��after����,���������γ�˫������
* �Ӱ����һ��Ԫ��ʱ,����hashֵ,��������,ȷ����Ԫ����table��λ��
* Ȼ����ӵ�Ԫ�ؼ��뵽˫������(����Ѿ�����,��ô�����)
* tail.next = newElement
* newElement.prev = tail
* tail = newElement
* �����Ļ�,���Ǳ���LinkedHashSetҲ��ȷ������˳��ͱ���˳��һ��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��14�� ����10:14:40
*/
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(new String("AAA"));
		set.add(456);
		set.add(new Customer("��",1001));
		set.add(123);
		set.add("cfg");
		System.out.println(set);
	}
}



class Customer{
	private String name;
	private int no ;
	public Customer(String name,int no) {
		this.name = name;
		this.no = no;
	}
	/*���:
	 * 1.LinkedHashSet���˳���ȡ��˳��һ��
	 * 2.LinkedHashSet�ײ�ά������һ��LinkedHashMap(HashMap������),�˴���HashSet��ͬ(�ײ���HashMap)
	 * 3.LinkedHashSet�ײ�ṹ(����table+˫������)
	 * 4.��ӵ�һ��ʱ,ֱ�ӽ�����table���ݵ�16,��ŵĽڵ�������LinkedHashMap$Entry,��HashSet��ͬ(���Node)
	 * ������HashMap$Node[],��ŵ�Ԫ��������LinkedHashMap$Entry����,˵���м̳й�ϵ����ʵ�ֹ�ϵ
	 * 
	 * 
	 * 
	 * */
	
}