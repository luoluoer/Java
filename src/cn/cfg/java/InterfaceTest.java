
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��26�� ����7:13:04
*/
public class InterfaceTest {
	public static void main(String[] args) {
		Camera camera = new Camera();
		Phone phone = new Phone ();
		Computer  computer = new Computer();
		computer.working(phone);//�ֻ����뵽�����
	}
}
