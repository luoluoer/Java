
package innerClass;

/**
* �����ڲ�����ϰ 
* �ڲ����ܹ�������:
* 1.�ֲ��ڲ��� �����ڷ����ڲ�,������
* 2.�����ڲ��� �����ڷ����ڲ�,������
* 3.��Ա�ڲ��� �����ڳ�Աλ���� ,û��static����
* 4.��̬�ڲ��� �����ڳ�Աλ���� ,��static����
* @author �񷽹�
* @version ����ʱ�䣺2021��12��28�� ����10:28:21
*/
public class innerClass {//�ⲿ������
	public static void main(String[] args) {
		
	}
}


class outerClass{//�ⲿ��
	public outerClass(int n1) {
		this.n1 = n1;
		// TODO Auto-generated constructor stub
	}
	private int n1 = 100;
	public void m1() {
		System.out.println("����m1()");
	}
	{
		System.out.println("�����");
	}
	class  innerClass{//�ڲ���
		
	}
}
