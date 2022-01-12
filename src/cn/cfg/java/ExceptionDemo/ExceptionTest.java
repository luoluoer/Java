
package cn.cfg.java.ExceptionDemo;

import java.util.Scanner;

/**
* 异常处理机制的作用是,程序不崩溃,继续向下运行
* 异常分为错误和异常两种,错误就是不能继续运行的叫做错误
* 异常又分为编译时异常和执行时异常两种
* 常见执行时异常:nullpointerexception arithmeticexception arrayindexoutofboundsexception
* classcastexception stackoverflowexception
* @author 柴方贵
* @version 创建时间：2022年1月11日 下午10:19:19
*/
public class ExceptionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		double result = 0.0;
		System.out.println("请输入被除数");
		num2 = new Scanner(System.in).nextInt();
		try {
			result = num1/num2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("程序继续执行");
		
		
		
	}
}
