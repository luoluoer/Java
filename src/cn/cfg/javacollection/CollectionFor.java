
package cn.cfg.javacollection;

import java.util.ArrayList;
import java.util.Collection;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��3�� ����11:04:00
*/
public class CollectionFor {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add(new Book("��������","�޹���",10.1));
		col.add(new Book("С��ɵ�","����",5.1));
		col.add(new Book("��¥��","��ѩ��",36.5));
		
		
		System.out.println(col);
		
		//��ǿfor�����Ͼ���һ��������,����Ӧ������ͼ���
		for(Object book:col) {
			System.out.println(book);
			Book b1 = (Book)book;
			System.out.println(b1.getName());
		}
	}
}