
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月7日 下午10:15:50
*/
public class ArrayTest {
	public static void main(String[] args) {
		//动态初始化
		double[] hen = new double[5];
		hen[0] = 0;
		hen[1] = 1;
		hen[2] = 2;
		hen[3] = 3;
		hen [4] = 4;
		System.out.println(hen[0]);
		
		//静态初始化
		double[] l = {3,4,5,6,7};
		System.out.println(l[2]);
	}
}
