
package cn.cfg.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
* Map与Collection冰雷存在,用于保存具有映射关系的Key-Value
* Map中的key和value可以是任何应用类型的数据,会封装到HashMap$Node对象中
* Map中的key不允许重复,原因和HashSet一样
* Map中的value可以重复
* Map的key可以为null,只能有一个 ;value也可以为null,可以有多个
* 一般来说String做Map的key,实际上任何类型都可以因为key是Object类型
* 
* @author 柴方贵
* @version 创建时间：2022年3月15日 下午10:17:32
*/
public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap(); 
		map.put("no1","cfg");
		map.put("no2","xyz");
		map.put("no3","zgl");
		//当有相同的key时,等价于替换value
		map.put("no3","zgl2");
		System.out.println(map);
		
		System.out.println(map.get("no3"));
	}
		
}
