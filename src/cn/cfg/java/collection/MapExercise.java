
package cn.cfg.java.collection;
import java.util.*;

/**
* ʹ��HashMap���3��Ա������Ҫ��:
* 1.��:Ա��id
* 2.ֵ:Ա������
* 3.������ʾ����>18000��Ա��(������ʽ��������)
* Ա����:����,����,Ա��id
* @author �񷽹�
* @version ����ʱ�䣺2022��3��20�� ����10:43:46
*/
public class MapExercise {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map hm = new HashMap();
		//1.�����������
		hm.put(1,new Emp("jack",30000,1));
		hm.put(2,new Emp("tom",3000,1));
		hm.put(3,new Emp("cfg",12000,1));
		
		
		//2.����
		//2.1ʹ��keyset��ʽ->��ǿfor
		Set  keyset = hm.keySet();
		for(Object key:keyset) {
			Emp emp = (Emp)hm.get(key);
			if (emp.getSalary()>18000) {
				System.out.println(emp);
			}
		}
		System.out.println("entry���������");
		//2.2ʹ��entrySet������
		Set es = hm.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext()) {
			//Object next = it.next();
			Map.Entry entry = (Map.Entry)it.next();
			//System.out.println(entry);//ʹ��entry.getkey ��entry.getvalue����ȡ����ֵ
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