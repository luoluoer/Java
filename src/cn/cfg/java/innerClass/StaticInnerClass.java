
package cn.cfg.java.innerClass;

/**
* ��̬�ڲ��� �����ⲿ��ĳ�Աλ��
* ��Ӧ��static����
* ����ֱ�ӷ����ⲿ�����ڵ����о�̬����,����˽�е�,���ǲ��ܷ��ʷǾ�̬��Ա
* �����������ķ������η�(public protected Ĭ�� private)
* @author ����
* @version ����ʱ�䣺2022��1��3�� ����5:00:33
*/
public class StaticInnerClass {
	public static void main(String[] args) {
		Outer10 out10 = new Outer10();
		out10.m1();
				
	}
}



class Outer10{
	private int n1 = 10;
	private static String name = "����";
	static class Inner10{
		public void say10() {
			System.out.println(name);
		}
		
		
		
	}
	public  void  m1() {
		Inner10 in10 = new Inner10();
		in10.say10();
	}
}
