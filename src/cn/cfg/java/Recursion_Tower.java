
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��4�� ����9:42:41
*/
public class Recursion_Tower {
	public static void main(String[] args) {
		
	}
}



class Tower{
	//num ��ʾҪ�ƶ��ĸ���,a,b,c�ֱ��ʾABC��
	//a���ƶ���,b�ǽ�����,c��Ŀ����
	public void move(int num ,char a ,char b ,char c ) {
		if (1==num) {
			System.out.println(a+"->"+c);
		}else {
			//����ж������,���Կ�������;������ĺ����������
			//1.���ƶ��������е����ӵ�B,����C
			move(num-1,a,c,b);
			//2.���������һ����,�ƶ���C
			System.out.println(a+"->"+c);
			//3.�ٰ�B��������,�ƶ���C,����A
			move(num-1,b,a,c);
		}
	}
}
