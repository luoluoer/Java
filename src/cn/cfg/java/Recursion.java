
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��2�� ����9:41:57
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
