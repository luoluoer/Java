
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月12日 下午8:27:19
*/
public class SubExtendsDetail_Base extends ExtendsDetail_Base{
	public SubExtendsDetail_Base() {
		//super();默认调用父类的无参构造器
		//如果父类的构造方法被重写,那么需要手动指定调用的构造方法
		System.out.println("SubExtendsDetail_Base().....");
	}
	
	public void sayOk() {
		System.out.println("THIS IS OK");
		System.out.println(n1+" "+n2+" "+n3);
		//System.out.println(n4);  //n4 不能访问到
		System.out.println(this.getN4());
	}
}