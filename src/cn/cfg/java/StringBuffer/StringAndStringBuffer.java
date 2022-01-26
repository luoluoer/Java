
package cn.cfg.java.StringBuffer;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年1月24日 下午10:23:12
*/
public class StringAndStringBuffer {
	public static void main(String[] args) {
		//String转StringBuffer
		String str = "Hellow World";
		//1.方式1
		StringBuffer sb1 = new StringBuffer(str);
		//2.方式2
		StringBuffer sb2 = new StringBuffer();
		sb2.append(str);
		
		//StringBuffer转String
		//1.方式1 toString
		StringBuffer sb = new StringBuffer("柴方贵学习");
		String strnew = sb.toString();
		//2.使用String构造器
		String strnew2 = new String(sb);
		//StringBuffer常用方法
		//1.append()
		sb.append(10);
		System.out.println(sb);
		//2.delete()
		sb.delete(1,2);//前闭后开区间
		System.out.println(sb);
		//3.replace() 
		sb.replace(1,2,"hahahaha");
		System.out.println(sb);
		//4.indexOf(),指定的字符串第一次出现的索引,如果没有,那么返回-1
		System.out.println(sb);
		System.out.println(sb.indexOf("学习"));
		System.out.println(sb.indexOf("笨蛋"));
		//5.insert() ,在指定的位置插入
		sb.insert(9,"二麻子");
		System.out.println(sb);
		//6.length(),返回长度
		System.out.println(sb.length());
		String s = null;
		StringBuffer ss = new StringBuffer();
		System.out.println("aaaaaaaa");
		System.out.println(ss.append(s).length());//ss.apend调用了abstractstringbuilder的APPendnull方法,所以长度是4
	}
}
