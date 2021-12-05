
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月5日 下午10:09:43
*/
public class Constructor {
	public static void main(String[] args) {
		Persontest p = new Persontest("Smith",40);
		System.out.println(p.name+"的年龄是"+p.age);
	}
}



class Persontest{
	String name;
	int age;
	
	
	public Persontest(String pName,int pAge) {
		name = pName;
		age = pAge;
	}
}