
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��7�� ����4:48:16
*/
public class ContinueTest {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			for (int j = 0;j<10;j++) {
				if (2==j) {
					continue;
					//continue ��Ӱ��ѭ��˳��,����ֱ�ӻص�ѭ��
				}
				System.out.println("j = "+j);
			}
		}
	}
}
