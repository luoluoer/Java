
package cn.cfg.java.collection;

import java.util.*;

/**
* Properties �̳���hashtable,���Բ���Ϊ��
* 
* @author �񷽹�
* @version ����ʱ�䣺2022��3��24�� ����10:24:56
*/
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.put("john",100);
		pro.put("cfg",200);
		System.out.println(pro);
		//��Ϊ��hashtable ��������
		//ɾ��Ԫ����remove
		pro.remove("cfg");//
		System.out.println(pro);
	}
}
