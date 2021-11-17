
package cn.cfg.java;

import java.util.Scanner;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月8日 下午10:16:08
*/
public class ArrayAdd {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		//int len = arr.length;
		int [] arrNew = new int [arr.length+1];
		for (int i = 0;i<arr.length;i++){
			arrNew[i] = arr[i];
		}
		System.out.println("请输入要追加的数字");
		Scanner sc = new Scanner(System.in);
		int im = sc.nextInt();
		arrNew[arr.length] = im;
		arr = arrNew;//arrnew的引用赋值给arr
		for (int i = 0;i<arrNew.length;i++) {
			System.out.print(arrNew[i]+"\t");
			
		}
	}
	
}
