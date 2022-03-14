
package cn.cfg.java.collection;

import java.util.*;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年3月3日 下午9:25:26
*/
public class CollectionIterator {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add(new Book("三国演义","罗贯中",10.1));
		col.add(new Book("小李飞刀","古龙",5.1));
		col.add(new Book("红楼梦","曹雪芹",36.5));
		
		
		System.out.println(col);
		
		
		//下面又要遍历得到col中的元素
		//1.生成 iterator 迭代器
		Iterator it = col.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
			//因为next的编译类型是Object,所以要转成Book类型,虽然  实际的运行类型是Book
			Book b1 = (Book)next;
			System.out.println(b1.getClass());
			System.out.println(b1.getName());
			
			
			
		}
		//此时  地带器 it 已经到了最后一位   如果想要再次遍历,需重置it
		//如下:it = col.iterator()
		
		
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