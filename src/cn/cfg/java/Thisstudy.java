
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��7�� ����9:51:21
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