
package cn.cfg.java;

import java.util.Scanner;

/**
* ��д��AAt,��һ������,�ж�һ����������ODD����ż��,����boolean
* ������,��,�ַ���ӡ��Ӧ�������������ַ�,����:��4,��:4�ַ�#,�ɴ�ӡ��Ӧ��Ч��
* @author ����
* @version ����ʱ�䣺2021��11��27�� ����9:34:43
*/
public class MethodExercise01 {
	public static void main(String[] args) {
		System.out.println("������Ҫ�жϵ�����");
		Scanner  sc = new Scanner(System.in);
		int bnum = 0;
		bnum = sc.nextInt();
		AAt a = new AAt();
		if (a.isOdd(bnum)) {
			System.out.println("������");
		}else {
			System.out.println("��ż��");
		}
		
		a.printchar(30,20,'t');
	}
}

class AAt {
	//˼·
	//1.�����ķ������� boolean
	//2.���������� isOdd
	//3. �������β� (int num)
	//4. ������ ,�ж�
	
	public boolean isOdd(int num) {
		//return num%2 !=0 ? true :false;
		//�����һ��,��һ���޸�
		return num%2 !=0;
	}
	
	
	public void printchar(int row,int col,char c ) {
		for (int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
