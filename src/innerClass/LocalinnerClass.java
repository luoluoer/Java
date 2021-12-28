
package innerClass;

/**
* 这是局部内部类的使用
* 1.局部内部类通常定义在外部类的方法中
* 2.可以直接访问外部类的所有成员,包括私有的
* 3.不能添加访问修饰符,因为他的地位就是一个局部变量,局部变量是不能添加访问修饰符的,但是可以使用final修饰,此时内部类不能被继承
* 4.作用域在方法体中
* 5.局部内部类可直接访问外部类的成员,例如内部的f2方法,直接访问了外部类的n1属性和m2方法
* 6.外部类在方法中,可直接创建内部类的对象从而访问内部类的属性和方法
* @author 柴方贵
* @version 创建时间：2021年12月28日 下午10:41:43
*/
public class LocalinnerClass {
	public static void main(String[] args) {
		
	}
}



class outer02{
	private int n1 = 100;
	private void m2() {
		System.out.println("这是外部类的m2方法");
	}
	public void m1() {
		//局部内部类通常定义在外部类的方法中
		
		class inner02{//局部内部类
			public void f2() {
				System.out.println("n1="+n1);
				m2();
			}
		}
	}
	
	inner02 in2 = new inner02();
}