
package cn.cfg.java.collection;

import java.util.*;

/**
* Set  其实就是数学意义上的集合
* @author 柴方贵
* @version 创建时间：2022年3月8日 下午10:10:26
*/
public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("hohn");
		set.add("lucy");
		set.add("hohn");
		set.add("make");
		set.add(null);
		set.add(null);
		//打印可以看出,添加的顺序和取出的顺序不一致
		//元素不能重复
		System.out.println(set);
		
		//迭代set
		Iterator it  = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		//For
		for(Object o :set) {
			System.out.println(o);
		}
		
	}
}
