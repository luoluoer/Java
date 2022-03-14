
package cn.cfg.java.collection;

/**
* �����ĵ�ע��
* LinkedList,�ײ�ά����һ��˫������
* LinkedList��ά������������first last�ֱ�ָ���׽ڵ��β�ڵ�
* ÿ���ڵ�(node����),������ά����prev��next��item��������,����ͨ��prev��ǰһ���ڵ�,ͨ��next���һ���ڵ�,����ʵ��˫������
* ����LinkedList��Ԫ�ص���Ӻ�ɾ��,����ͨ��������ɵ�,���Ч�ʽϸ�
* @author �񷽹�
* @version ����ʱ�䣺2022��3��6�� ����10:43:29
*/



//����һ��Node��,��ʾ˫�������һ���ڵ�
class Node{
	public Object item ;//�����������
	public Node next;//ָ����һ���ڵ�
	public Node prev;//ָ��ǰһ���ڵ�
	public Node(Object name){
		this.item = name;
		
	}
	public String toString() {
		return "Node name="+item;
	}
	
}




public class LinkedListDemo {
	public static void main(String[] args) {
		//ģ��һ��˫������
		Node jack = new Node("jack");
		Node tom = new Node("tom");
		Node cfg = new Node("cfg");
		//�γ�˫������
		jack.next = tom;
		tom.next = cfg;
		cfg.prev = tom;
		tom.prev = jack;
		Node first = jack;//˫�������ͷ
		Node last = cfg;//˫�������β
		
		
		//��ʾ,��ͷ��β����
		while (true) {
			if(first ==null) {break;}
			System.out.println(first);			
			first = first.next;//ָ����һ���ڵ�,����first�ʼ��jack,first.netx�ͻ�ָ��tom
		}
		//��ʾ,��β��ͷ����
		while (true) {
			if(last ==null) {break;}
			System.out.println(last);
			
			last = last.prev;//ָ����һ���ڵ�,����first�ʼ��jack,first.netx�ͻ�ָ��tom

		}
	//��ʾ���һ��node,��tom��cfg֮�����һ������zhangfei
		Node zhangfei = new Node("zhangfei");
		zhangfei.next = cfg;
		zhangfei.prev = tom;
		cfg.prev = zhangfei;
		tom.next = zhangfei;
		
		
		
		
	
	}
}