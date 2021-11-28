
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月28日 下午9:38:00
*/
public class MethodParameter {
	public static void main(String[] args) {
	B b = new B();
	Person p = new Person();
	p.name = "jaca";
	p.age = 10;
	b.test200(p);
	System.out.println("main的p.age="+p.age);
	}
}

class Person {
	String name;
	int age;
}

 
class B {
	public void test200(Person p) {

		p.age = 2000;

		//p  = null;  //此处的p=null不会影响main方法的p,此处只是把形参的p指向了null,并不会影响对现象的属性,
		//就是说,main中有一个p  指向了Person的引用;test2000的p指向了null
		
	}
	
}