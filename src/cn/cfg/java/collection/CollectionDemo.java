
package cn.cfg.java.collection;

import java.util.*;

/**
* 这是文档注释
* 集合主要有两种 (单列集合   双列集合),List Set 是单列集合,存放单个元素   Map是双列集合,存放键值对
* Collection主要有Set和List
* List包含 Vector   ArrayList(数组 )   LinkedList(链表)
* Set包含 HashSet TreeSet
* 
* 还有一种是Map  ,是键值对形式
* Map包含 Hashtable HashMap TreeMap 类
* Hashtable 包含 Properties类
* HashMap 包含 LinkedHashMap
* @author 柴方贵
* @version 创建时间：2022年2月16日 下午10:32:45
*/
public class CollectionDemo {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		ArrayList arraylist  = new ArrayList();
		arraylist.add("jack");
		arraylist.add("tom");
		
		HashMap hashmap   = new HashMap();
		hashmap.put("NO1","北京");
		hashmap.put("NO2","山东");
		
	}
}
