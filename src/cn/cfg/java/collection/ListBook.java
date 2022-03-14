
package cn.cfg.java.collection;
import java.util.*;

/**
* 使用List的实现类添加三本图书,并遍历,打印如下效果:
* 名称:xx  价格:xx   作者:xx
* 名称:xx  价格:xx   作者:xx
* 名称:xx  价格:xx   作者:xx
* 1) 按价格排序,从低到高
* 2)要求使用ArrayList LinkedList 和 Vector 三种集合实现
* @author 柴方贵
* @version 创建时间：2022年3月6日 下午8:49:19
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
		return "名称:"+name+"     价格:"+price+"  作者:	"+author;
	}
	
}

public class ListBook {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new BookTest("三国演义","罗贯中",10.1));
		list.add(new BookTest("小李飞刀","古龙",5.1));
		list.add(new BookTest("红楼梦传","曹雪芹",36.5));
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




