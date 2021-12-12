
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��8�� ����10:24:02
*/
public class getMethodinConstructor {
	public static void main(String[] args) {
		newPerson person = new newPerson();
		person.setName("�ϲ�");
		person.setAge(30);
		person.setSalary(30000);
		System.out.println(person.info());
		System.out.println(person.getSalary());
		
	}
}


class newPerson{
	private String name;
	private int age ;
	private double salary ;
	public newPerson() {}
	public newPerson (String name,int age) {
//		this.name = name;
//		this.age = age;
		setName(name);
		setAge(age);
	}	
	
	public newPerson (String name,int age,double salary) {
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
		setName(name);
		setAge(age);
		setSalary(salary);
	}
	public String info() {
		return "name"+this.name+"   age"+this.age;
	}
	public void setName (String name) {
		if (name.length()>=2&&name.length()<=6) {
			this.name = name;
		}else {
			System.out.println("���ֳ��Ȳ���ȷ");
			this.name = "������";
		}
		
	}
	
	public void setAge(int age) {
		if(age>=1&&age<=120) {
			this.age = age;
		}else {
			System.out.println("��������䲻��ȷ");
			this.age = 0;
		}
	}
	public void setSalary(double salary) {
		if(salary>=3000&&salary<=30000) {
			this.salary = salary;
		}else {
			System.out.println("���н�ʳ�������");
			this.salary = 0;
		}
	}
	
	
	public void getName() {
		System.out.println("�û���������"+this.name);
	}
	
	public int getAge() {
		System.out.println("�û���������"+this.age);
		return this.age;
	}


	public double getSalary() {
		System.out.println("�û���н������"+this.salary);
		return this.salary;
	}
}
