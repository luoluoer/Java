
package cn.cfg.java.collection;

import java.util.*;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��7�� ����10:14:01
*/
public class LinkedListSource {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		for(int i = 1;i<=2;i++) {
			linkedlist.add(i);
			//��һ��Ԫ�ص�����߼�
			/*1.LinkedList linkedlist = new LinkedList();
			 * ��ʱ  linkedlist�� first��last���Զ���null
			 * 2.ִ�����
			 * boolean add(E e){
			 * linklase(e)
			 * return true
			 * }
			 * 3.���µĽڵ�,�ӵ�˫����������
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
    				��Ϊֻ�����һ��Ԫ��,����linkedlist��first��last��ָ���˸�Ԫ��
    				4.����ӵڶ���Ԫ�ص�ʱ��
    				new Node<>(l, e, null),��ʱ��l������node��prev������,Ҳ��ʵ����prevָ���һ��Ԫ��
    				Ȼ��ִ��l.next = newNode,����һ��Ԫ�ص�next����,ָ���һ��Ԫ��
    				�γ�˫������
    				
    				
    				
			 * */
		}
		linkedlist.add(100);
		linkedlist.add(100);
		for (Object obj:linkedlist) {
			System.out.println(obj);
		}
		
	}
}
