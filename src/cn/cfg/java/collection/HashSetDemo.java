
package cn.cfg.java.collection;
import java.util.*;
/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��3��9�� ����10:22:29
*/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hset = new HashSet();
		//HashSet�з���ֵ,��ʾ��ӳɹ���ʧ��
		System.out.println(hset.add("john"));
		System.out.println(hset.add("lucy"));
		System.out.println(hset.add("john"));
		//�����add Dog�����Գɹ�����Ϊ����˲�ͬ�Ķ���
		System.out.println(hset.add(new Dogg()));
		System.out.println(hset.add(new Dogg()));
		//�ڶ���add(new String("jack")) ��ʧ��,��ΪString��д��hasecode������equals����
		System.out.println(hset.add(new String("jack")));
		System.out.println(hset.add(new String("jack")));
	}
}

class Dogg{
	Dogg(){}
}