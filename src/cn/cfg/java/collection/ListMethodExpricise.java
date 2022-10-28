
package cn.cfg.java.collection;

import java.util.*;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年3月6日 下午6:35:37
*/
/*添加10个以上的元素(如String "hello"),
 * 在2号位添加一个"柴方贵" ,取出第五个元素,删除第六个元素,修改第7个元素,使用迭代器遍历
 * 要求使用List的实现类ArrayList完成
 * */
public class ListMethodExpricise {
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i = 0;i<12;i++) {
			list.add("hellow"+i);
		}
		System.out.println(list);
		
		list.add(2,"柴方贵");
		System.out.println(list.get(4));
		list.remove(5);
		list.set(6,"zhx");
		System.out.println(list);
		//遍历方法1
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//遍历方法2
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//遍历方法3
		for(Object o :list) {
			System.out.println(o);
		}
		
	}
}
