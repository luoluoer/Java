
package cn.cfg.java.collection;

/**
* 这是文档注释
* LinkedList,底层维护了一个双向链表
* LinkedList中维护的两个属性first last分别指向首节点和尾节点
* 每个节点(node对象),里面又维护了prev和next和item三个属性,其中通过prev向前一个节点,通过next向后一个节点,最终实现双向链表
* 所以LinkedList的元素的添加和删除,不是通过数组完成的,相对效率较高
* @author 柴方贵
* @version 创建时间：2022年3月6日 下午10:43:29
*/



//定义一个Node类,表示双向链表的一个节点
class Node{
	public Object item ;//真正存放数据
	public Node next;//指向下一个节点
	public Node prev;//指向前一个节点
	public Node(Object name){
		this.item = name;
		
	}
	public String toString() {
		return "Node name="+item;
	}
	
}




public class LinkedListDemo {
	public static void main(String[] args) {
		//模拟一个双向链表
		Node jack = new Node("jack");
		Node tom = new Node("tom");
		Node cfg = new Node("cfg");
		//形成双向链表
		jack.next = tom;
		tom.next = cfg;
		cfg.prev = tom;
		tom.prev = jack;
		Node first = jack;//双向链表的头
		Node last = cfg;//双向链表的尾
		
		
		//演示,从头到尾遍历
		while (true) {
			if(first ==null) {break;}
			System.out.println(first);			
			first = first.next;//指向下一个节点,例如first最开始是jack,first.netx就会指向tom
		}
		//演示,从尾到头遍历
		while (true) {
			if(last ==null) {break;}
			System.out.println(last);
			
			last = last.prev;//指向下一个节点,例如first最开始是jack,first.netx就会指向tom

		}
	//演示添加一个node,在tom和cfg之间添加一个对象zhangfei
		Node zhangfei = new Node("zhangfei");
		zhangfei.next = cfg;
		zhangfei.prev = tom;
		cfg.prev = zhangfei;
		tom.next = zhangfei;
		
		
		
		
	
	}
}