
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月10日 下午10:01:47
*/
public class TwoDimensionalArray {
	public static void main(String[] args) {
		//第一种方式
		int[][] arr =  {
			{0,0,0,0,0,0},
			{0,0,1,0,0,0},
			{0,2,0,3,0,0},
			{0,0,0,0,0,0}
		};
		//第二种方式
		//二维数组 arr2 里面有2个一维数组,每个一维数组有3个数
		int [][] arr2 = new int[2][3];
		
		//第三种方式
		int [][] arr3 = new int [3][];
		for (int i = 0;i<arr3.length;i++) {
			//下面一行代码的作用是,给一维数组开空间
			arr3[i] = new int[i+1];
			//开完空间以后,数组的样子是 arr3是一个由3个一维数组组成的二维数组
			//其中第一个一维数组的长度是1,第二个一维数组的长度是2,第三个一维数组的长度是3
			
			//下面,给数组赋值
			for (int j = 0;j<arr3[i].length;j++) {
				arr3[i][j] = i+1;
			}			
		}
	//打印arr3
		for (int i = 0;i<arr3.length;i++) {
			for(int j = 0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		//第四种方式
		//遍历二维数组,并将各个值累计到int sum 
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
