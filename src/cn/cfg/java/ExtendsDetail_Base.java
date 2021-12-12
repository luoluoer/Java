
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月12日 下午8:21:34
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
