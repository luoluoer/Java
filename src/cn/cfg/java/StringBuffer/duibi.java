
package cn.cfg.java.StringBuffer;

/**
* String  StringBuffer  StringBuilder对比
* 1.String 复用率高,效率低,因为是放在常量池中
* StringBuffer,线程安全,效率高,可变序列
* StringBuilder,线程不安全,效率最高,可变序列
* 如果队字符串,进行大量的修改,建议不要使用String
* 使用原则:如果字符串有大量的修改,那么使用StringBuffer或者StringBuilder
* 如果是单线程,使用Stringbuilder
* 如果是多线程,使用StringBuffer
* 如果字符串修改非常少,使用String,例如数据库的配置信息
* 
* @author 柴方贵
* @version 创建时间：2022年1月25日 下午10:58:10
*/
public class duibi {

}
