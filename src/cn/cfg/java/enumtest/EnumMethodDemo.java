
package cn.cfg.java.enumtest;


/**
* 这是Enum类的方法介绍
* 1.name(),输出对象名
* 2.ordinal(),输出编号,序号,枚举编号
* 3.values(),这个方法比较特殊,不是Enum的方法,是在编译java文件时生成的values()方法,通过反编译Season.class
* 文件可以看到,有values()这个方法..特殊说明:EnumDemo.java编译后会有EnumDemo.class和Season.class
* 4.values()的返回类型是Season[] ,是个数组
* 5.valueOf(),这个方法是将字符串转成枚举对象,要求字符串必须为已有的常量名,否则报异常
* 6.compareTo(),比较两个枚举常量,比较的就是编号//0表示相同,其他值表示不同,因为return self.ordinal - other.ordinal;
* @author 柴方贵
* @version 创建时间：2022年1月5日 下午10:07:12
*/
public class EnumMethodDemo {
	public static void main(String[] args) {
		Season autumn = Season.AUTUMN;
		System.out.println(autumn.name());
		System.out.println(autumn.ordinal());
		System.out.println();
		System.out.println(Season.values());
		
		//增强for开始
		Season[] svalue = Season.values();
		System.out.println(svalue);
		for(Season s :svalue) {
			//System.out.println(s.name());
			System.out.println(s);
		
		}
		//增强for结束
		
		Season autumn1 = Season.valueOf("AUTUMN");
		System.out.println("autumn1的对象是"+autumn1);
		System.out.println(autumn1==autumn);//返回true ,因为确实是同一个对象,Season里面只有一个AUTUMN嘛
		System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));
	}
}
