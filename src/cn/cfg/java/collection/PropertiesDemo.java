
package cn.cfg.java.collection;

import java.util.*;

/**
* Properties 继承了hashtable,所以不能为空
* 
* @author 柴方贵
* @version 创建时间：2022年3月24日 下午10:24:56
*/
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.put("john",100);
		pro.put("cfg",200);
		System.out.println(pro);
		//因为是hashtable 所以无序
		//删除元素用remove
		pro.remove("cfg");//
		System.out.println(pro);
	}
}
