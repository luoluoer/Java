
package cn.cfg.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
* Map��Collection���״���,���ڱ������ӳ���ϵ��Key-Value
* Map�е�key��value�������κ�Ӧ�����͵�����,���װ��HashMap$Node������
* Map�е�key�������ظ�,ԭ���HashSetһ��
* Map�е�value�����ظ�
* Map��key����Ϊnull,ֻ����һ�� ;valueҲ����Ϊnull,�����ж��
* һ����˵String��Map��key,ʵ�����κ����Ͷ�������Ϊkey��Object����
* 
* @author �񷽹�
* @version ����ʱ�䣺2022��3��15�� ����10:17:32
*/
public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap(); 
		map.put("no1","cfg");
		map.put("no2","xyz");
		map.put("no3","zgl");
		//������ͬ��keyʱ,�ȼ����滻value
		map.put("no3","zgl2");
		System.out.println(map);
		
		System.out.println(map.get("no3"));
	}
		
}
