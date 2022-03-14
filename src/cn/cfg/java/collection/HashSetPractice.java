
package cn.cfg.java.collection;

import java.util.HashSet;

/**
* 定义一个Emp类,包含private成员属性 name,age 要求:
* 1.定义3个Emp对象放入HashSet 中
* 2.当name和age的值向同事,认为是相同员工,不能添加到HashSet集合
* @author 柴方贵
* @version 创建时间：2022年3月12日 下午10:40:10
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