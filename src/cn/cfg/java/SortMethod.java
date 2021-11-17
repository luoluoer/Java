
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月9日 下午9:38:29
*/
public class SortMethod {
	public static void main(String[] args) {
		int[] arr = {24,13,69,80,37};
		int temp = 0;//定义中间变量用于交换
		
		
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
			System.out.println("第"+(num+1)+"次的比较结果");
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
