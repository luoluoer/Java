
package cn.cfg.java;

/**
* �����ĵ�ע��
* �����Ҫ��2�����ĺ���ô public int sum(int n1,int n2) 
* �����Ҫ��2�����ĺ���ô public int sum(int n1,int n2, int n3)
* ͬ��,�����ӷǳ��˷�ʱ��,������Ҫ�ɱ���� 
* @author ����
* @version ����ʱ�䣺2021��12��5�� ����9:05:41
*/
public class VarParameter {
	public static void main(String[] args) {
		HspMethod h = new HspMethod();
		h.sum(1,2,3,4,5);
	}
}



class HspMethod{
	public int sum(int... nums) {
		// nums�൱��һ������
		int res =0;
		for (int i = 0;i<nums.length;i++) {
			res+=nums[i];
		}
		System.out.println(nums.length);
		System.out.println(res);
		return 0;
	}
}