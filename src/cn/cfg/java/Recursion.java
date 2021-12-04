
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月2日 下午9:41:57
*/
public class Recursion {
	public static void main(String[] args) {
		T t1 = new T();
		t1.test(4);
	}
}

class T{
	public void test(int n ) {
		if (n>2) {
			test(n-1);
			
		}else {}
		System.out.println("n=" +n);
		
	}
	
}
