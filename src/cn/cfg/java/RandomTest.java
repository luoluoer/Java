
package cn.cfg.java;


/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��7�� ����4:23:54
*/
public class RandomTest {
	public static void main(String[] args) {
		int i = 0;
		int flag = 0;
		
		while (true) {
			
			i =(int)( Math.random()*100)+1;
			if (97==i) {
				flag ++;
				System.out.println("��"+flag+"�ε�ʱ��ﵽ97");
				break;
			}
			System.out.println(i);
			flag++;
			
		}
	}
}
