
package cn.cfg.java;

/**
* 打印杨辉三角
* @author 作者
* @version 创建时间：2021年11月13日 下午9:50:42
*/
public class TwoDimensionalArrayapply {
	//打印一个10行的杨辉三角
	
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
