
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月24日 下午10:38:39
*/
public class MethodDetail {
	public static void main(String[] args) {
		AA a = new AA();
		int [] res = a.getSumAndSub(1,4);
		System.out.println("和为"+res[0]);
		System.out.println("差为"+res[1]);
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