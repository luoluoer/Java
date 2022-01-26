
package cn.cfg.java.StringBuffer;

/**
* StringBuilder和StringBuffer一样,继承了AbastractStringBuilder类
* 实现了S俄日阿里咋办了,说明StringBuilder对象是串行化(对象可以网络传输,可以保存到文件)
* StringBuilder是final类,不能被继承
* StringBuilder对象字符串序列仍然是存放在父类AbastractStringBuilder的char[] value
* 因此,字符序列是堆中
* StringBuilder的方法,没有做互斥的处理,即没有synchronized关键字,因此在单线程的情况下,使用StringBuilder
* @author 柴方贵
* @version 创建时间：2022年1月25日 下午10:43:47
*/
public class StringBuilder {
	public static void main(String[] args) {
		
	}
}
