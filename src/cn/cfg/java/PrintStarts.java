
package cn.cfg.java;

import java.util.Scanner;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��6�� ����10:18:26
*/
public class PrintStarts {
	public static void main(String[] args) {
		System.out.println("������������Ĳ���");
		int totallevel = 0;
		Scanner sc = new Scanner(System.in);
		totallevel = sc.nextInt();
		//��һ����������ʼ
		for (int i = 0;i<totallevel;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//��һ������������
		//�ڶ�����������ʼ
		for (int i = 0;i<totallevel;i++) {
			//��ӡ�ո�
			for(int k = totallevel;k>i;k--) {
				System.out.print(" ");
			}
			//��ӡ*
			for(int j = 0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//�ڶ�������������
		
		//��������������ʼ
		for (int i = 0;i<totallevel;i++) {
			//��ӡ�ո�
			for(int k = totallevel;k>i;k--) {
				System.out.print(" ");
			}
			//��ӡ*��ո�
			for(int j = 0;j<2*i+1;j++) {
				if (0==j||j==2*i||totallevel-1==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
		//����������������
	}
}
