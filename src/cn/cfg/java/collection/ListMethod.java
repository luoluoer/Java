
package cn.cfg.java.collection;

import java.util.*;

/**
* 这是文档注释
* List集合类中的元素有序,且可重复
* List集合中的每个元素都有索引并支持索引取值
* List容器中元素
* JKD中List接口的常见实现子类有Vector ArrayList linkedList
* @author 柴方贵
* @version 创建时间：2022年3月5日 下午10:29:04
*/
public class ListMethod {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add("jack");
		list.add("mack");
		List list2 = new  ArrayList();
		list2.add("1");
		list2.add("11");
		list2.add("111");
		//1.list索引值对应的元素
		System.out.println( list.get(2));
		//2.list 指定位置添加元素
		list.add(1,"cfg");
		System.out.println(list);
		//3.addAll(index,list),将list添加到源list的指定位置
		//3.addAll(list)将list添加到源list
		list.addAll(1,list2);
		System.out.println(list);
		//4.在集合中首次出现的位置
		System.out.println(list.indexOf("cfg"));
		//5.在集合中最后一次出现的索引
		System.out.println(list.lastIndexOf("jack"));
		//6.移除某个位置上的元素
		list.remove(1);
		System.out.println(list);
		//7.修改某个索引上的元素
		list.set(1,"111111");
		System.out.println(list);
		
		//8.sublist返回从fromindex到toindex位置的集合,前闭后开
		List list_sub = list.subList(0,2);
		System.out.println(list_sub);
	}
}
