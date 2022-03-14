
package cn.cfg.java.collection;

import java.util.ArrayList;
import java.util.*;

/**
* �����ĵ�ע��
* @author �񷽹�
*����3��Dog(name ,age) ����,���뵽ArrayList��,��ֵ��List����
*�õ���������ǿFor���ַ�ʽ����
*��дDog���String ����
* @version ����ʱ�䣺2022��3��5�� ����9:00:05
*/



class Dog {
	String name;
	int age ;
	
	Dog(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}



public class CollectionDemoExpricise {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Dog("dog1",11));
		list.add(new Dog("dog2",22));
		list.add(new Dog("dog3",33));
		
		
		//����������
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object d = it.next();//������Object����,������ѧϰԭ��
			System.out.println(d);
			
		}
		
	}
	
}
