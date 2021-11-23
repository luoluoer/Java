
package cn.cfg.java;

import java.util.*;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月17日 下午10:19:30
*/
public class Arrayadd10random {
	public static void main(String[] args) {
		int[]  ran = new int[10];
		for(int i = 0;i<ran.length;i++) {
			ran[i] = (int)(Math.random()*100)+1;
		}	
	
		System.out.println("ran数组的情况");
		for(int i = 0;i<ran.length;i++) {
		System.out.print(ran[i]+"\t");	
		}
		System.out.println();
		
		System.out.println("ran数组的倒序情况");
		for(int i = ran.length-1;i>=0;i--) {
		System.out.print(ran[i]+"\t");	
		}
		System.out.println();
		
		int sum = 0;
		double average = 0;
		int max = ran[0];
		int maxindex = 0;
		for(int i = 0;i<ran.length;i++) {
			if (max<ran[i]) {
				max = ran[i];
				maxindex = i;
			}
			sum +=ran[i];
		}
		average = sum/ran.length;
		
		System.out.println("max="+max+"\n"+"maxindex="+maxindex+"\n");
		System.out.println("average="+average);
	}
	
}
