
package cn.cfg.java.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet底层维护的是一个LinkedHashMap,这点与HashSet不通
* LinkedHashSet是双向的,基本上相当于是HashSet添加了双向链表
* 在LinkedHashSet中维护了一个Hash表和双向链表(LinkedHashSet有head和tail)
* 没一个节点有before和after属性,这样可以形成双向链表
* 子啊添加一个元素时,先求hash值,再求索引,确定该元素在table的位置
* 然后将添加的元素加入到双向链表(如果已经存在,那么不添加)
* tail.next = newElement
* newElement.prev = tail
* tail = newElement
* 这样的话,我们遍历LinkedHashSet也能确保插入顺序和遍历顺序一致
* @author 柴方贵
* @version 创建时间：2022年3月14日 下午10:14:40
*/
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(new String("AAA"));
		set.add(456);
		set.add(new Customer("刘",1001));
		set.add(123);
		set.add("cfg");
		System.out.println(set);
	}
}



class Customer{
	private String name;
	private int no ;
	public Customer(String name,int no) {
		this.name = name;
		this.no = no;
	}
	/*解读:
	 * 1.LinkedHashSet添加顺序和取出顺序一致
	 * 2.LinkedHashSet底层维护的是一个LinkedHashMap(HashMap的子类),此处与HashSet不同(底层是HashMap)
	 * 3.LinkedHashSet底层结构(数组table+双向链表)
	 * 4.添加第一次时,直接将数组table扩容到16,存放的节点类型是LinkedHashMap$Entry,与HashSet不同(存放Node)
	 * 数组是HashMap$Node[],存放的元素数据是LinkedHashMap$Entry类型,说明有继承关系或者实现关系
	 * 
	 * 
	 * 
	 * */
	
}