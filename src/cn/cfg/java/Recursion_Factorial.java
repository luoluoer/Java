
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��4�� ����8:45:52
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
