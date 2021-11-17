
package cn.cfg.java;

import java.util.Scanner;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月9日 下午10:54:08
*/
public class SequenceSelect {
	public static void main(String[] args) {
		String[] names = {"a","b","c","d"};
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的名字");
		String findName = sc.next();
		boolean flag = false;
		for (int i = 0;i<names.length;i++) {
			if (findName.equals(names[i])) {
				flag = true;
			System.out.println("恭喜你找到了"+ findName);	
			System.out.println("下标为" + i);
			break;
			}
		}
		if (!flag) {
			System.out.println("不存在输入的内容");
		}
	}
}
