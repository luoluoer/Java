
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��5�� ����10:09:43
*/
public class Constructor {
	public static void main(String[] args) {
		Persontest p = new Persontest("Smith",40);
		System.out.println(p.name+"��������"+p.age);
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