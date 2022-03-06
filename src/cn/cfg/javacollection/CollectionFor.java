
package cn.cfg.javacollection;

import java.util.ArrayList;
import java.util.Collection;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年3月3日 下午11:04:00
*/
public class CollectionFor {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add(new Book("三国演义","罗贯中",10.1));
		col.add(new Book("小李飞刀","古龙",5.1));
		col.add(new Book("红楼梦","曹雪芹",36.5));
		
		
		System.out.println(col);
		
		//增强for本质上就是一个迭代器,可以应用数组和集合
		for(Object book:col) {
			System.out.println(book);
			Book b1 = (Book)book;
			System.out.println(b1.getName());
		}
	}
}