
package cn.cfg.java;

/**
* 正常的冒泡排序  假如有n个数字  那么总共需要进行n-1轮比较
* 第一次比较 需要比较n-1次
* 第二次比较  需要进行 n-2次
* 第三次比较 需要进行n-3次
* @author cfg
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
			System.out.println("第"+(num+1)+"轮的比较结果");
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
//			if (issorted) {  //如果issorted是false 说明   没有进行交换,说明顺序已经正确,可以提前退出循环;
//				break;
//			}
		}


	
}
}
