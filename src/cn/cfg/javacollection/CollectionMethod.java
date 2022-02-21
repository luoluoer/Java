
package cn.cfg.javacollection;

//import java.util.ArrayList;
import java.util.*;

/**
*add  单个添加元素
*remove 删除元素
*contains 查找元素是否存在
*size获取元素个数
*isEmpty判断是否为空
*clear 清空
*addAll 添加多个元素
*containsAll 查找多个元素是否存在
*removeAll 删除多个元素
* @author 柴方贵
* @version 创建时间：2022年2月21日 下午10:01:53
*/
public class CollectionMethod {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add(10);
		list.add(true);
		System.out.println(list);
		list.remove(0);//删除第一个元素
		System.out.println(list);
		//list.remove("jack");//指定删除的对象
		
		System.out.println(list.contains("jack"));//判断元素是否存在
		System.out.println(list.size());//元素的个数
		System.out.println(list.isEmpty());//判断是否为空
		list.clear();//清空list
		System.out.println(list);
		
		List list2 = new ArrayList();
		list2.add("红楼梦");
		list2.add("三国演义");
		list.addAll(list2);//将list2全部添加到list
		System.out.println(list);
		System.out.println(list.containsAll(list2));//判断所有元素是否存在,参数是collection
		list.add("聊斋");
		list.removeAll(list2);//从list中删除list2包含的元素
		System.out.println(list);
		
		
		
		
		
		
	}
}
