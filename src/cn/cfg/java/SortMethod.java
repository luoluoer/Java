
package cn.cfg.java;

/**
* ������ð������  ������n������  ��ô�ܹ���Ҫ����n-1�ֱȽ�
* ��һ�αȽ� ��Ҫ�Ƚ�n-1��
* �ڶ��αȽ�  ��Ҫ���� n-2��
* �����αȽ� ��Ҫ����n-3��
* @author cfg
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
			System.out.println("��"+(num+1)+"�ֵıȽϽ��");
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
//			if (issorted) {  //���issorted��false ˵��   û�н��н���,˵��˳���Ѿ���ȷ,������ǰ�˳�ѭ��;
//				break;
//			}
		}


	
}
}
