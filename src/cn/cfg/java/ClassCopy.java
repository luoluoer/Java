
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月28日 下午10:04:21
*/
public class ClassCopy {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "milan";
		p.age = 100;
		Mytools tools = new Mytools();
		Person p2 = tools.copyPerson(p);
		//到此,p和p2都是Person得到对象,但是  是两个独立的对象,属性相同
		System.out.println("p的属性age是"+p.age);
		System.out.println("p的属性name是"+p.name);
		System.out.println("p2的属性age是"+p2.age);
		System.out.println("p2的属性name是"+p2.name);
		
	}
}


class Mytools{
	//编写一个方法copyPerson ,可以赋值一个Person对象,返回赋值的对象,克隆对象
	//注意要求得到的新对象和原来的对象是两个独立的对象,只是他们的属性相同
	
	//思路:
	//1. 方法的返回类型Person 
	//2. 方法的名字 copyPerson
	//3. 方法的形参 (Person p)
	//4. 方法体,创建一个新对象,并且复制属性,返回即可
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		
		return p2;
	}
	
}
