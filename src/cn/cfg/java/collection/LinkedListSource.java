
package cn.cfg.java.collection;

import java.util.*;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年3月7日 下午10:14:01
*/
public class LinkedListSource {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		for(int i = 1;i<=2;i++) {
			linkedlist.add(i);
			//第一个元素的添加逻辑
			/*1.LinkedList linkedlist = new LinkedList();
			 * 此时  linkedlist的 first和last属性都是null
			 * 2.执行添加
			 * boolean add(E e){
			 * linklase(e)
			 * return true
			 * }
			 * 3.将新的节点,加到双向链表的最后
			 *      void linkLast(E e) {
        			final Node<E> l = last;
        			final Node<E> newNode = new Node<>(l, e, null);
        			last = newNode;
			        if (l == null)
			            first = newNode;
			        else
			            l.next = newNode;
			        size++;
			        modCount++;
    				}
    				因为只添加了一个元素,所以linkedlist的first和last都指向了该元素
    				4.在添加第二个元素的时候
    				new Node<>(l, e, null),此时将l传到了node的prev属性上,也就实现了prev指向第一个元素
    				然后执行l.next = newNode,将第一个元素的next属性,指向第一个元素
    				形成双向链表
    				
    				
    				
			 * */
		}
		linkedlist.add(100);
		linkedlist.add(100);
		for (Object obj:linkedlist) {
			System.out.println(obj);
		}
		
	}
}
