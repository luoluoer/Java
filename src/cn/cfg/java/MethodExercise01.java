
package cn.cfg.java;

import java.util.Scanner;

/**
* 编写类AAt,有一个方法,判断一个数是奇数ODD还是偶数,返回boolean
* 根据行,列,字符打印答应行数和列数的字符,比如:行4,列:4字符#,澤打印相应的效果
* @author 作者
* @version 创建时间：2021年11月27日 下午9:34:43
*/
public class MethodExercise01 {
	public static void main(String[] args) {
		System.out.println("请输入要判断的数字");
		Scanner  sc = new Scanner(System.in);
		int bnum = 0;
		bnum = sc.nextInt();
		AAt a = new AAt();
		if (a.isOdd(bnum)) {
			System.out.println("是奇数");
		}else {
			System.out.println("是偶数");
		}
		
		a.printchar(30,20,'t');
	}
}

class AAt {
	//思路
	//1.方法的返回类型 boolean
	//2.方法的名字 isOdd
	//3. 方法的形参 (int num)
	//4. 方法体 ,判断
	
	public boolean isOdd(int num) {
		//return num%2 !=0 ? true :false;
		//上面的一行,进一步修改
		return num%2 !=0;
	}
	
	
	public void printchar(int row,int col,char c ) {
		for (int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
