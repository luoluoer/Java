
package innerClass;

/**
* ���Ǿֲ��ڲ����ʹ��
* 1.�ֲ��ڲ���ͨ���������ⲿ��ķ�����
* 2.����ֱ�ӷ����ⲿ������г�Ա,����˽�е�
* 3.������ӷ������η�,��Ϊ���ĵ�λ����һ���ֲ�����,�ֲ������ǲ�����ӷ������η���,���ǿ���ʹ��final����,��ʱ�ڲ��಻�ܱ��̳�
* 4.�������ڷ�������
* 5.�ֲ��ڲ����ֱ�ӷ����ⲿ��ĳ�Ա,�����ڲ���f2����,ֱ�ӷ������ⲿ���n1���Ժ�m2����
* 6.�ⲿ���ڷ�����,��ֱ�Ӵ����ڲ���Ķ���Ӷ������ڲ�������Ժͷ���
* @author �񷽹�
* @version ����ʱ�䣺2021��12��28�� ����10:41:43
*/
public class LocalinnerClass {
	public static void main(String[] args) {
		
	}
}



class outer02{
	private int n1 = 100;
	private void m2() {
		System.out.println("�����ⲿ���m2����");
	}
	public void m1() {
		//�ֲ��ڲ���ͨ���������ⲿ��ķ�����
		
		class inner02{//�ֲ��ڲ���
			public void f2() {
				System.out.println("n1="+n1);
				m2();
			}
		}
	}
	
	inner02 in2 = new inner02();
}