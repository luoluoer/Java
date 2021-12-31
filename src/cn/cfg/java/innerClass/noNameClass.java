
package cn.cfg.java.innerClass;

/**
 * 写在最前面的话,但是是从最后面得出的结论:匿名内部类与局部内部类基本相同,只有一点就是匿名内部类的属性,不能被外部类访问到,
 * 原因是,匿名内部类使用一次就消亡了
 * 
 * 
* 1.需求,使用IA接口并创建对象
* 2.传统方式是,写一个类实现接口,并创建对象
* 3.现在的需求是Tiger类只是用一次,后面不再使用
* 4.可以使用匿名内部类来简化开发
* 5.tiger的编译类型是IA,运行类型是匿名内部类
* @author 柴方贵
* @version 创建时间：2021年12月29日 下午11:21:04
*/
public class noNameClass {
	public static void main(String[] args) {
		Outer04 o4 = new Outer04();
		o4.method();
	}
}




class Outer04{
	private int n1 = 100;
	public  void method() {
		//匿名内部类开始
		
		//下面的代码相当于class tiger$1implment IA ,然后重写IA的cry方法
		/*
		 class outer94$1 implement IA{
		 	public void cry(){System.out.println("老虎叫声呼呼呼");}
		 }
		  */
		IA tiger = new IA() {
			public void cry() {
				System.out.println("老虎叫声呼呼呼");
			}
		};//此处有分号,尤其注意
		//匿名内部类结束
		
		tiger.cry();
		/* 
		 以上的匿名内部类可以取消对象调用cry方法直接简写成
		new IA(){
		public void cry() {
				System.out.println("老虎叫声呼呼呼");
			}
		}.cry();
		 同理,所有匿名内部类都可以这样操作,而取消掉声明对象再调用方法的过程
		  */
		System.out.println("tiger的运行内存是"+tiger.getClass());
		//第二个匿名内部类开始  基于实体类的匿名内部类
		Father f = new Father("jack") {
			//方法体中可以用来重写父类Father的方法,虽然此处是空的方法体
			//new Father("jack") 会将jack传给对应的构造器
		};
		//第二个匿名内部类结束
		//相当于说 匿名内部类有两种形式 
		//匿名内部类第一种 接口 对象名 = new 接口(){}
		//匿名内部类第二种 类名 对象名 = new 类名(){}
		System.out.println("f的运行类型是"+f.getClass());
		//第三个匿名内部类开始,基于抽象类的匿名内部类
		 new Animal() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("抽象类的匿名内部类");
			}
			
		};
		
		//第三个匿名内部类结束,基于抽象类的匿名内部类
	}
}

interface IA{
	public void cry();
}



class Father {
	public Father(String name) {
		super();
	}
	public void test() {}
}


abstract class Animal{
	abstract void eat() ;
}

