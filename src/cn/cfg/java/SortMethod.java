
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��9�� ����9:38:29
*/
public class SortMethod {
	public static void main(String[] args) {
		int[] arr = {24,13,69,80,37};
		int temp = 0;//�����м�������ڽ���
		
		
		for(int num = 0;num<arr.length-1;num++) {
			boolean issorted = true;
			for (int i= 0;i<arr.length-1-num;i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					issorted = false;
					
				}
			}
			System.out.println("��"+(num+1)+"�εıȽϽ��");
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			if (issorted) {
				break;
			}
		}


	
}
}
