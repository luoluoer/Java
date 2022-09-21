
package cn.cfg.java.collection;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
* Car类(name,price),如果name和price一样,则认为是相同元素,不能添加
* @author 柴方贵
* @version 创建时间：2022年3月15日 下午9:40:23
*/
public class LinkedHashSetPractice {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Car("奥拓",1000));
		lhs.add(new Car("奥迪",30000));
		lhs.add(new Car("法拉利",10000000));
		lhs.add(new Car("奥迪",30000));
		lhs.add(new Car("保时捷",70000000));
		lhs.add(new Car("奥迪",30000));
		
		System.out.println(lhs);
	}
}



class Car{
	private String name;
	private double price;
	
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
		return Objects.hash(name,price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	
	
	
	
}

