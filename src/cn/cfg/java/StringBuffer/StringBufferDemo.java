
package cn.cfg.java.StringBuffer;

/**
* StringBuffer的直接父类是AbstractStringBuilder
* StringBuffer实现了Serializable,即StringBuffer可串行化
* 在父类中, AbstractStringBuffer有属性char[]  value  不是final
* 该value数组存放字符串内容,所以存放在堆中
* StringBuffer是一个final类,不能被继承
* 
* StringBuffer的构造器主要有四个:
* 1.StringBuffer(), 构造一个不带字符的字符串缓冲区,初始容量16个字符
* 2.StringBuffer(Charsequence),构造一个字符串缓冲区,它包含与charsequence相同的字符
* 基本没用
* 3.StringBuffer(int capacity),构造一个字符串缓冲区,指定大小为capacity
* 4.通过给String创建一个StringBuffer
* @author 柴方贵
* @version 创建时间：2022年1月23日 下午10:58:22
*/
public class StringBufferDemo {
	public static void main(String[] args) {
		//1. 
		StringBuffer sb1 = new StringBuffer();
		//2.不介绍
		//3.
		StringBuffer sb3 = new StringBuffer(20);
		
		StringBuffer sb4 =  new StringBuffer("abcd");
	}
}
