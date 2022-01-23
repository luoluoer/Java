
package cn.cfg.java.WrapperType;

import cn.cfg.java.InterfaceTest;

/**
* char ---character
* boolean --- Boolean
* byte --- Byte
* short ---short
* int --- Interger
* long --- Long
* float ---Float
* double --- Double
* 基本数据类型与包装类型的转换,jdk1.5之前手动装箱拆箱   jdk1.5以后自动拆箱装箱
* @author 柴方贵
* @version 创建时间：2022年1月20日 下午10:43:41
*/
public class WrapperDemo {
	public static void main(String[] args) {
		//int和integer的拆箱 装箱
		//1.手动装箱,两种方式
		int n1 = 100;
		
		 Integer integer = new Integer(n1);
		 Integer integer1 = Integer.valueOf(n1);
		 System.out.println(integer);
		 //2.手动拆箱
		 int i = integer.intValue();
		 
		 //自动装箱
		 int n2 = 200;
		 Integer integer2 = n2;
		 //自动拆箱
		 int n3 = integer2;
		 
		 //其他包装类的用法类似
		 //包装类->String 
		 //方法1
		 Integer ii = 100;
		 String str = ii+"";
		 //方法2
		 String str2 = ii.toString();
		 //方法3
		 String str3 = String.valueOf(ii);
		 
		 //String ->包装类(Integer)
		 //方法1
		 String strr = "123456";
		 Integer num1 = Integer.parseInt(strr);//parseInt返回 int,然后自动装箱
		 //方法2
		 Integer num2 = new Integer(strr);
		 char  s = "aaa".charAt(1);
		 
		 
		 
		 
		 
		 
	}
}
