
package cn.cfg.java.arrays;
import java.util.*;

/**
* �Զ���Book��,����name��price,��price��С����,�Ӵ�С����,
* Book[] books = 4
* ʹ��ǰ���Comparator�ӿ������ڲ���,�Լ۸�Ӵ��С,��С��������
* �����������Ƚ�������
* @author �񷽹�
* @version ����ʱ�䣺2022��2��6�� ����4:56:00
*/
public class ArrayysExcise {
	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0] = new Book("��¥��",100);
		books[1] = new Book("��ƿ÷��",90);
		books[2] = new Book("������ժ20",5);
		books[3] = new Book("java�����ŵ�����",300);
		//���ռ۸��������
		Arrays.sort(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//�˴���o1��o2��object���͵�book����,����Ҫת��book
				Book book1 = (Book)o1;
				Book book2 = (Book)o2;
				double res = book2.getPrice()-book1.getPrice();
				
				// TODO Auto-generated method stub
				//return 0;
				return  res>0||res==0 ? 1:-1;//�����ǴӴ�С,��ת����ֵ��λ�þ��Ǵ�С����
			}
		});
		
		System.out.println(Arrays.toString(books));
		//Arrays.toString(books)����
		//Arrays.toString(books)->b.append(String.valueOf(a[i]));->valueOf���������obj.toString();
		System.out.println(books);
		System.out.println(books.toString());
		
		
		
		//���������ĳ��Ƚ�������
		Arrays.sort(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//�˴���o1��o2��object���͵�book����,����Ҫת��book
				Book book1 = (Book)o1;
				Book book2 = (Book)o2;
				int res = book2.getName().length() -book1.getName().length();
				
				// TODO Auto-generated method stub
				//return 0;
				return  res;//�����ǴӴ�С,��ת����ֵ��λ�þ��Ǵ�С����
			}
		});
		
		System.out.println(Arrays.toString(books));
		
	}
	
	
}


class Book {
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	/**
	 * 
	 */
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	Book(String name ,double price){
		this.name = name;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//�˴���д����object���toString����
		return "Book{"+
				"name='"+name+'\''+
				"price="+price+
				'}';
	}
	
}