
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月4日 下午8:45:52
*/
public class Recursion_Factorial {
	public static void main(String[] args) {
		int res = 0;
		Ft ft = new Ft();
		res = ft.factorial(5);
		System.out.println(res);
	}
	
}


class Ft {
	public int factorial(int n) {
		if (1==n) {
			return 1;
		}else {
			return factorial(n-1)*n;
		}
	}
	
}
