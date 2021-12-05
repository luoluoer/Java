
package cn.cfg.java;

/**
* 这是文档注释
* 如果想要求2个数的和那么 public int sum(int n1,int n2) 
* 如果想要求2个数的和那么 public int sum(int n1,int n2, int n3)
* 同理,这样子非常浪费时间,所以需要可变参数 
* @author 作者
* @version 创建时间：2021年12月5日 下午9:05:41
*/
public class VarParameter {
	public static void main(String[] args) {
		HspMethod h = new HspMethod();
		h.sum(1,2,3,4,5);
	}
}



class HspMethod{
	public int sum(int... nums) {
		// nums相当于一个数组
		int res =0;
		for (int i = 0;i<nums.length;i++) {
			res+=nums[i];
		}
		System.out.println(nums.length);
		System.out.println(res);
		return 0;
	}
}