
package cn.cfg.java.collection;


import java.util.*;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年3月16日 下午10:46:37
*/
public class MapMethod {
//put  get size clear
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("邓超","孙俪");
		map.put("王宝强","马蓉");
		map.put("宋喆","马蓉");
		map.put("刘凌波",null);
		map.put(null,"刘亦菲");
		map.put("鹿晗","关晓彤");
		
		//遍历方式1:
		//先取出所有的key
		Set keyset = map.keySet();
		System.out.println(keyset);
		//进行迭代
		for(Object key:keyset) {
			System.out.println(key+"---"+map.get(key));
		}
		//通过迭代器,迭代key
		Iterator it = keyset.iterator();
		System.out.println("遍历方式2");
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key+"---"+map.get(key));
		}
	}
}
