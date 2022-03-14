
package cn.cfg.java.collection;

import java.util.*;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��3�� ����9:25:26
*/
public class CollectionIterator {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add(new Book("��������","�޹���",10.1));
		col.add(new Book("С��ɵ�","����",5.1));
		col.add(new Book("��¥��","��ѩ��",36.5));
		
		
		System.out.println(col);
		
		
		//������Ҫ�����õ�col�е�Ԫ��
		//1.���� iterator ������
		Iterator it = col.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
			//��Ϊnext�ı���������Object,����Ҫת��Book����,��Ȼ  ʵ�ʵ�����������Book
			Book b1 = (Book)next;
			System.out.println(b1.getClass());
			System.out.println(b1.getName());
			
			
			
		}
		//��ʱ  �ش��� it �Ѿ��������һλ   �����Ҫ�ٴα���,������it
		//����:it = col.iterator()
		
		
	}
}



class Book{
	private String name;
	private String author;
	private double price;
	Book(String name,String author , double price){
		this.name = name;
		this.author = author;
		this.price = price;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}