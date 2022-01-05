
package cn.cfg.java.innerClass;

/**
* 静态内部类 放在外部类的成员位置
* 是应用static修饰
* 可以直接访问外部类所在的所有静态方法,包括私有的,但是不能访问非静态成员
* 可以添加任意的访问修饰符(public protected 默认 private)
* @author 作者
* @version 创建时间：2022年1月3日 下午5:00:33
*/
public class StaticInnerClass {
	public static void main(String[] args) {
		Outer10 out10 = new Outer10();
		out10.m1();
				
	}
}



class Outer10{
	private int n1 = 10;
	private static String name = "张三";
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
