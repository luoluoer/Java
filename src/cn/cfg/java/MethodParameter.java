
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��28�� ����9:38:00
*/
public class MethodParameter {
	public static void main(String[] args) {
	B b = new B();
	Person p = new Person();
	p.name = "jaca";
	p.age = 10;
	b.test200(p);
	System.out.println("main��p.age="+p.age);
	}
}

class Person {
	String name;
	int age;
}

 
class B {
	public void test200(Person p) {

		p.age = 2000;

		//p  = null;  //�˴���p=null����Ӱ��main������p,�˴�ֻ�ǰ��βε�pָ����null,������Ӱ������������,
		//����˵,main����һ��p  ָ����Person������;test2000��pָ����null
		
	}
	
}