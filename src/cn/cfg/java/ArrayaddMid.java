
package cn.cfg.java;

import java.util.Scanner;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月16日 下午9:28:22
*/
public class ArrayaddMid {
	public static void main(String[] args) {
		
		int [] arr = {10,12,45,90};
		int [] addarr = new int[arr.length+1];
		int insertnum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要插入的数字");
		insertnum = sc.nextInt();
		for(int i = 0;i<arr.length;i++) {
			if (arr[i]<=insertnum) {
				addarr[i] = arr[i];
			}
			
			
			else {
				addarr[i] = insertnum;
				for(int j = i+1;j<addarr.length;j++,i++) {
					addarr[j] = arr[i];
				}
				
				break;
			}
			
			
		}
		
		
		
		for(int j = 0;j<addarr.length;j++) {
			System.out.print(addarr[j]+"\t");
		}
		
	}
}
