
package cn.cfg.java.collection;

import java.util.HashSet;

/**
* ����һ��Emp��,����private��Ա���� name,age Ҫ��:
* 1.����3��Emp�������HashSet ��
* 2.��name��age��ֵ��ͬ��,��Ϊ����ͬԱ��,������ӵ�HashSet����
* @author �񷽹�
* @version ����ʱ�䣺2022��3��12�� ����10:40:10
*/
public class HashSetPractice {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Employee("milan",18));
		hs.add(new Employee("smith",28));
		hs.add(new Employee("milan",18));
		System.out.println(hs);
				
	}
}


class Employee{
	
	
	private String name;
	private int age ;
	public   Employee(String name,int age) {
		// TODO Auto-generated method stub
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	

	
	
}