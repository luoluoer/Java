
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月8日 下午10:24:02
*/
public class getMethodinConstructor {
	public static void main(String[] args) {
		newPerson person = new newPerson();
		person.setName("老柴");
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
			System.out.println("名字长度不正确");
			this.name = "无名人";
		}
		
	}
	
	public void setAge(int age) {
		if(age>=1&&age<=120) {
			this.age = age;
		}else {
			System.out.println("输入的年龄不正确");
			this.age = 0;
		}
	}
	public void setSalary(double salary) {
		if(salary>=3000&&salary<=30000) {
			this.salary = salary;
		}else {
			System.out.println("你的薪资出问题了");
			this.salary = 0;
		}
	}
	
	
	public void getName() {
		System.out.println("用户的姓名是"+this.name);
	}
	
	public int getAge() {
		System.out.println("用户的年龄是"+this.age);
		return this.age;
	}


	public double getSalary() {
		System.out.println("用户的薪资是是"+this.salary);
		return this.salary;
	}
}
