
package cn.cfg.java;

import java.util.Scanner;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月6日 下午10:18:26
*/
public class PrintStarts {
	public static void main(String[] args) {
		System.out.println("请输入金字塔的层数");
		int totallevel = 0;
		Scanner sc = new Scanner(System.in);
		totallevel = sc.nextInt();
		//第一个金字塔开始
		for (int i = 0;i<totallevel;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//第一个金字塔结束
		//第二个金字塔开始
		for (int i = 0;i<totallevel;i++) {
			//打印空格
			for(int k = totallevel;k>i;k--) {
				System.out.print(" ");
			}
			//打印*
			for(int j = 0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//第二个金字塔结束
		
		//第三个金字塔开始
		for (int i = 0;i<totallevel;i++) {
			//打印空格
			for(int k = totallevel;k>i;k--) {
				System.out.print(" ");
			}
			//打印*或空格
			for(int j = 0;j<2*i+1;j++) {
				if (0==j||j==2*i||totallevel-1==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
		//第三个金字塔结束
	}
}
