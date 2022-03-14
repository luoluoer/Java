
package cn.cfg.java.collection;

import java.util.ArrayList;
import java.util.*;

/**
* 这是文档注释
* @author 柴方贵
*创建3个Dog(name ,age) 对象,放入到ArrayList中,赋值给List引用
*用迭代器和增强For两种方式遍历
*重写Dog类的String 方法
* @version 创建时间：2022年3月5日 下午9:00:05
*/



class Dog {
	String name;
	int age ;
	
	Dog(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}



public class CollectionDemoExpricise {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Dog("dog1",11));
		list.add(new Dog("dog2",22));
		list.add(new Dog("dog3",33));
		
		
		//迭代器迭代
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object d = it.next();//必须用Object接收,后面再学习原因
			System.out.println(d);
			
		}
		
	}
	
}
