
package cn.cfg.java;

import java.util.Scanner;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��9�� ����10:54:08
*/
public class SequenceSelect {
	public static void main(String[] args) {
		String[] names = {"a","b","c","d"};
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		String findName = sc.next();
		boolean flag = false;
		for (int i = 0;i<names.length;i++) {
			if (findName.equals(names[i])) {
				flag = true;
			System.out.println("��ϲ���ҵ���"+ findName);	
			System.out.println("�±�Ϊ" + i);
			break;
			}
		}
		if (!flag) {
			System.out.println("���������������");
		}
	}
}
