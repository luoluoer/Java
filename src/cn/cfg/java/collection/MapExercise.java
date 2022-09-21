
package cn.cfg.java.collection;
import java.util.*;

/**
* 使用HashMap添加3个员工对象要求:
* 1.键:员工id
* 2.值:员工对象
* 3.遍历显示工资>18000的员工(遍历方式最少两种)
* 员工类:姓名,工资,员工id
* @author 柴方贵
* @version 创建时间：2022年3月20日 下午10:43:46
*/
public class MapExercise {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map hm = new HashMap();
		//1.添加三个数据
		hm.put(1,new Emp("jack",30000,1));
		hm.put(2,new Emp("tom",3000,1));
		hm.put(3,new Emp("cfg",12000,1));
		
		
		//2.遍历
		//2.1使用keyset方式->增强for
		Set  keyset = hm.keySet();
		for(Object key:keyset) {
			Emp emp = (Emp)hm.get(key);
			if (emp.getSalary()>18000) {
				System.out.println(emp);
			}
		}
		System.out.println("entry迭代器输出");
		//2.2使用entrySet迭代器
		Set es = hm.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext()) {
			//Object next = it.next();
			Map.Entry entry = (Map.Entry)it.next();
			//System.out.println(entry);//使用entry.getkey 和entry.getvalue可以取到键值
			Emp emp = (Emp)entry.getValue();
			if(((Emp)entry.getValue()).getSalary()>18000) {
				System.out.println(emp);
			}
			
		}

	}
}



class Emp{

	String name;
	double salary;
	int id;
	
	public Emp(String name, double salary, int id) {
		
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
	
}