
package cn.cfg.java.innerClass;

/**
* �и�Bell�ӿ�,�ӿ���һ��ring����
* ��һ���ֻ���CellPhone,�������ӵĹ���,alarmclock,����Bell����
* �����ֻ�������幦��,ͨ�������ڲ�����Ϊ����,��ӡ��������;
* �ٴ���һ�������ڲ����ӡС����Ͽ���
* @author �񷽹�
* @version ����ʱ�䣺2022��1��1�� ����10:14:50
*/
public class InnerClassUse02 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.alarmclock(new Bell() {

			@Override
			public void ring() {
				// TODO Auto-generated method stub
				System.out.println("��������");
			}
		});
		
		
		cp.alarmclock(new Bell() {

			@Override
			public void ring() {
				// TODO Auto-generated method stub
				System.out.println("С����Ͽ���");
			}
			
		});
	}
}

class CellPhone{
	public void alarmclock(Bell bell) {
		bell.ring();
	}
	
}

interface Bell{
	public void ring();
	
}
