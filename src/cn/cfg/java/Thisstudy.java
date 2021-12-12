
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月7日 下午9:51:21
*/
public class Thisstudy {
	public static void main(String[] args) {
		PersonT p1 = new PersonT("mary",30);
		PersonT p2 = new PersonT("marya",30);
		System.out.println(p1.compareTo(p2));
	}
}



class PersonT {
	String name;
	int age;
	public PersonT (String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(PersonT p) {
//		if (this.name.equals(p.name)&&this.age == p.age){
//			return true;
//		}else {
//			return false;
//		}
		return this.name.equals(p.name)&&this.age == p.age;
	}
	
}