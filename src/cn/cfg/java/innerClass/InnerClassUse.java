
package cn.cfg.java.innerClass;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2022��1��1�� ����9:55:46
*/
public class InnerClassUse {
	public static void main(String[] args) {
		f1(new ICTest() {
			public void saylang() {
				System.out.println("�����ڲ���Ӧ��");
			}  
			}
		);
	}
	public static void f1(ICTest ict){
		ict.saylang();
	};
}



interface ICTest{
	public void saylang();
}


//��ͳ��ʽ
/*
 * class InnerClassUse$1 implements ICTest{
 * public void saylang(){
 * System.out.println("�����ڲ���Ӧ��");
 * }
 * }
 * Ȼ�����ö������
 * f1(new InnerClassUse$1)
 * */