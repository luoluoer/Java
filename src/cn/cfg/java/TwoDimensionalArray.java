
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��11��10�� ����10:01:47
*/
public class TwoDimensionalArray {
	public static void main(String[] args) {
		//��һ�ַ�ʽ
		int[][] arr =  {
			{0,0,0,0,0,0},
			{0,0,1,0,0,0},
			{0,2,0,3,0,0},
			{0,0,0,0,0,0}
		};
		//�ڶ��ַ�ʽ
		//��ά���� arr2 ������2��һά����,ÿ��һά������3����
		int [][] arr2 = new int[2][3];
		
		//�����ַ�ʽ
		int [][] arr3 = new int [3][];
		for (int i = 0;i<arr3.length;i++) {
			//����һ�д����������,��һά���鿪�ռ�
			arr3[i] = new int[i+1];
			//����ռ��Ժ�,����������� arr3��һ����3��һά������ɵĶ�ά����
			//���е�һ��һά����ĳ�����1,�ڶ���һά����ĳ�����2,������һά����ĳ�����3
			
			//����,�����鸳ֵ
			for (int j = 0;j<arr3[i].length;j++) {
				arr3[i][j] = i+1;
			}			
		}
	//��ӡarr3
		for (int i = 0;i<arr3.length;i++) {
			for(int j = 0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		//�����ַ�ʽ
		//������ά����,��������ֵ�ۼƵ�int sum 
		int arr4[][] = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for (int i = 0;i <arr4.length;i++) {
			for(int j = 0;j<arr4[i].length;j++) {
				sum += arr4[i][j];
			}
		}
		
		System.out.println("sum="+sum);
		
	}
}
