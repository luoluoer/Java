
package cn.cfg.java.collection;
import java.util.*;
/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年3月9日 下午10:22:29
*/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hset = new HashSet();
		//HashSet有返回值,表示添加成功和失败
		System.out.println(hset.add("john"));
		System.out.println(hset.add("lucy"));
		System.out.println(hset.add("john"));
		//下面的add Dog都可以成功是因为添加了不同的对象
		System.out.println(hset.add(new Dogg()));
		System.out.println(hset.add(new Dogg()));
		//第二个add(new String("jack")) 会失败,因为String重写了hasecode方法和equals方法
		System.out.println(hset.add(new String("jack")));
		System.out.println(hset.add(new String("jack")));
	}
}

class Dogg{
	Dogg(){}
}