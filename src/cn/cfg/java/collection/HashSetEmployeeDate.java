
package cn.cfg.java.collection;

import java.util.*;

/**
* ����һ��EmployeeDemo,�������� name sal birthday(MyDate����),
* ����MyDate���Ͱ�������(year month day)
* Ҫ��:
* ����3��EmployeeDemo����HashSet
* ��name��birthday��ͬʱ,��Ϊ����ͬԱ��,������ӵ�HashSet
* @author �񷽹�
* @version ����ʱ�䣺2022��3��13�� ����12:02:18
*/
public class HashSetEmployeeDate {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new EmployeeDemo("milan",20,new Mydate(2020,12,12)));
		hs.add(new EmployeeDemo("jack",20,new Mydate(2020,12,12)));
		hs.add(new EmployeeDemo("milan",20,new Mydate(2020,12,12)));
		System.out.println(hs);
	}
}

class Mydate{
	int year;
	int month;
	int day;
	
	public Mydate() {
		// TODO Auto-generated constructor stub
	}
	public Mydate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Mydate other = (Mydate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.year+"-"+this.month+"-"+this.day;
	} 
	
	
}


class EmployeeDemo{
	String name;
	double sal;
	Mydate birthday;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
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
		EmployeeDemo other = (EmployeeDemo) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	EmployeeDemo(String name,double sal,Mydate birthday){
		this.name =  name;
		this.sal = sal;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [name=" + name + ", sal=" + sal + ", birthday=" + birthday + "]";
	}
	
}