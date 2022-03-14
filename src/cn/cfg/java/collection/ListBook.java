
package cn.cfg.java.collection;
import java.util.*;

/**
* ʹ��List��ʵ�����������ͼ��,������,��ӡ����Ч��:
* ����:xx  �۸�:xx   ����:xx
* ����:xx  �۸�:xx   ����:xx
* ����:xx  �۸�:xx   ����:xx
* 1) ���۸�����,�ӵ͵���
* 2)Ҫ��ʹ��ArrayList LinkedList �� Vector ���ּ���ʵ��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��6�� ����8:49:19
*/
class BookTest{
	private String name;
	private String author;
	private double price;
	BookTest(String name,String author , double price){
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
		return "����:"+name+"     �۸�:"+price+"  ����:	"+author;
	}
	
}

public class ListBook {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new BookTest("��������","�޹���",10.1));
		list.add(new BookTest("С��ɵ�","����",5.1));
		list.add(new BookTest("��¥�δ�","��ѩ��",36.5));
		for(Object obj:list) {
			System.out.println(obj);
			
		}
		sort(list);
		System.out.println(list);
			
		}
	public static void sort(List list) {
		int listsize = list.size();
		for (int i = 0;i<listsize-1;i++) {
			for (int j = 0;j<listsize-1-i;j++) {
				BookTest book1  = (BookTest)list.get(j);
				BookTest book2  = (BookTest)list.get(j+1);
				if(book1.getPrice()>book2.getPrice()) {
					list.set(j,book2);
					list.set(j+1,book1);
				}
			}
		}
	}
}




