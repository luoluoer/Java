
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��24�� ����10:38:39
*/
public class MethodDetail {
	public static void main(String[] args) {
		AA a = new AA();
		int [] res = a.getSumAndSub(1,4);
		System.out.println("��Ϊ"+res[0]);
		System.out.println("��Ϊ"+res[1]);
	}
}


class AA {
	/**
	 * 
	 */
	public int[] getSumAndSub(int n1 ,int n2) {
		// TODO Auto-generated method stub
		int[] resArr = new int[2];
		resArr[0] = n1+n2;
		resArr[1] = n1-n2;
		return resArr;
		
	}
	public int f1() {
		double d1 = 1.1*3;
		int n = 100;
		return n;
	}
	
	
}