
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��28�� ����10:04:21
*/
public class ClassCopy {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "milan";
		p.age = 100;
		Mytools tools = new Mytools();
		Person p2 = tools.copyPerson(p);
		//����,p��p2����Person�õ�����,����  �����������Ķ���,������ͬ
		System.out.println("p������age��"+p.age);
		System.out.println("p������name��"+p.name);
		System.out.println("p2������age��"+p2.age);
		System.out.println("p2������name��"+p2.name);
		
	}
}


class Mytools{
	//��дһ������copyPerson ,���Ը�ֵһ��Person����,���ظ�ֵ�Ķ���,��¡����
	//ע��Ҫ��õ����¶����ԭ���Ķ��������������Ķ���,ֻ�����ǵ�������ͬ
	
	//˼·:
	//1. �����ķ�������Person 
	//2. ���������� copyPerson
	//3. �������β� (Person p)
	//4. ������,����һ���¶���,���Ҹ�������,���ؼ���
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		
		return p2;
	}
	
}
