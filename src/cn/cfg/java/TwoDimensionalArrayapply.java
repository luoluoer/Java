
package cn.cfg.java;

/**
* ��ӡ�������
* @author ����
* @version ����ʱ�䣺2021��11��13�� ����9:50:42
*/
public class TwoDimensionalArrayapply {
	//��ӡһ��10�е��������
	
	public static void main(String[] args) {
		int[][] yanghui = new int[10][];
	
		for (int i = 0;i<yanghui.length;i++) {
			yanghui[i] = new int[i+1];
			for (int j = 0;j<yanghui[i].length;j++) {
				if (j ==0||j==yanghui[i].length-1) {
					yanghui[i][j] = 1;
				}else {
					yanghui[i][j] = yanghui[i-1][j] +yanghui[i-1][j-1];
				}
			}

		}
		for (int i1 = 0;i1<yanghui.length;i1++) {
			for (int j = 0;j<yanghui[i1].length;j++) {
				System.out.print(yanghui[i1][j]+ "\t");
			}
			System.out.println();
		}
	}
}
