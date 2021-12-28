
package innerClass;

/**
* 这是内部类练习 
* 内部类总共分四种:
* 1.局部内部类 定义在方法内部,有类名
* 2.匿名内部类 定义在方法内部,无类名
* 3.成员内部类 定义在成员位置上 ,没有static修饰
* 4.静态内部类 定义在成员位置上 ,有static修饰
* @author 柴方贵
* @version 创建时间：2021年12月28日 下午10:28:21
*/
public class innerClass {//外部其他类
	public static void main(String[] args) {
		
	}
}


class outerClass{//外部类
	public outerClass(int n1) {
		this.n1 = n1;
		// TODO Auto-generated constructor stub
	}
	private int n1 = 100;
	public void m1() {
		System.out.println("方法m1()");
	}
	{
		System.out.println("代码块");
	}
	class  innerClass{//内部类
		
	}
}
