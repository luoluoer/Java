
package cn.cfg.java.arrays;
import java.util.*;

/**
* 自定义Book类,包含name和price,按price从小到大,从大到小排序,
* Book[] books = 4
* 使用前面的Comparator接口匿名内部类,对价格从打大到小,从小到大排序
* 按照书名长度进行排序
* @author 柴方贵
* @version 创建时间：2022年2月6日 下午4:56:00
*/
public class ArrayysExcise {
	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0] = new Book("红楼梦",100);
		books[1] = new Book("金瓶梅新",90);
		books[2] = new Book("青年文摘20",5);
		books[3] = new Book("java从入门到放弃",300);
		//按照价格进行排序
		Arrays.sort(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//此处的o1和o2是object类型的book对象,所以要转成book
				Book book1 = (Book)o1;
				Book book2 = (Book)o2;
				double res = book2.getPrice()-book1.getPrice();
				
				// TODO Auto-generated method stub
				//return 0;
				return  res>0||res==0 ? 1:-1;//这样是从大到小,调转返回值的位置就是从小到大
			}
		});
		
		System.out.println(Arrays.toString(books));
		//Arrays.toString(books)解析
		//Arrays.toString(books)->b.append(String.valueOf(a[i]));->valueOf下面调用了obj.toString();
		System.out.println(books);
		System.out.println(books.toString());
		
		
		
		//按照书名的长度进行排序
		Arrays.sort(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//此处的o1和o2是object类型的book对象,所以要转成book
				Book book1 = (Book)o1;
				Book book2 = (Book)o2;
				int res = book2.getName().length() -book1.getName().length();
				
				// TODO Auto-generated method stub
				//return 0;
				return  res;//这样是从大到小,调转返回值的位置就是从小到大
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
		//此处重写的是object类的toString方法
		return "Book{"+
				"name='"+name+'\''+
				"price="+price+
				'}';
	}
	
}