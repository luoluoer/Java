
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��12�� ����8:21:34
*/
public class ExtendsDetail_Base {
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	public ExtendsDetail_Base() {
		System.out.println("ExtendsDetail_Base().....");
		
	}
	public void test100() {
		System.out.println("test100.....");
	}
	protected void test200() {
		System.out.println("test200.....");
	}
	 void test300() {
		System.out.println("test300.....");
	}
	 private void test400() {
		System.out.println("test300.....");
	}
	 
	 public int getN4 () {
		 return n4;
	 }
}
