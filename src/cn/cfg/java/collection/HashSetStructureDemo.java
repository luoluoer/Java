
package cn.cfg.java.collection;

/**
* ģ��һ��HashSet�ĵײ�(HashMap�ĵײ�ṹ     )
* @author �񷽹�
* @version ����ʱ�䣺2022��3��10�� ����9:37:19
*/
public class HashSetStructureDemo {
	public static void main(String[] args) {
		//1.������һ������,����������Node[]
		NodeDemo[] table = new NodeDemo[16];//2.��Щ��ֱ�ӽ�Node����,��Ϊtable
		//3,�����ڵ�
		NodeDemo john = new NodeDemo("john",null);
		table[2] = john;//��John�ŵ�����table��������2��λ��
		NodeDemo jack = new NodeDemo("jack",null);
		john.next = jack;//��Jack�ڵ�,�ҵ�John
		
		NodeDemo rose = new NodeDemo("rose",null);
		jack.next = rose;//��rose�ڵ�,�ҵ�jack
		NodeDemo lucy = new NodeDemo("lucy",null);
		table[3] = lucy;//��lucy�ŵ�����table��������3��λ��
		//������δ���, ��ʵ������table������±�Ϊ2��λ�������һ������
		//�����Ԫ�������� john  jack  rose
		//��table������±�Ϊ3��λ�������һ������
		//�����Ԫ���� lucy
	}
}


//���ϴ���ֻ��Ϊ�˸��õ�˵��HashSet(HashMap)
/*1.HashSet�ĵײ���HashMap
 * 2.���һ��Ԫ��ʱ,�ȵõ�hashֵ,Ȼ��ת������ֵ
 * 3.�ҵ��洢���ݱ�table,���������λ���Ƿ��Ѿ����Ԫ��
 * 4.���û��ֱ�Ӽ���
 * 5.�����,����equals�����Ƚ�,��� ��ͬ,�������,�����ͬ,����ӵ����
 * 6.Java8��,���һ�������Ԭ���������� TREEIFY_THRESHOLD(Ĭ��8),����table�Ĵ�С>=MIN_TREEIFYY_CAPPACITY(������64),�ͻ��������
 * */


class NodeDemo{//�ڵ�,�洢����,����ָ����һ���ڵ�,�Ӷ��γ�����
	Object item ;//�������
	NodeDemo next;//ָ����һ���ڵ�
	
	/**
	 * 
	 */
	public NodeDemo(Object item,NodeDemo next) {
		// TODO Auto-generated constructor stub
		this.item = item;
		this.next = next;
	}
	
}