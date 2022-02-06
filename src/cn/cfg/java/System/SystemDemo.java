
package cn.cfg.java.System;

import java.util.Arrays;

/**
* 1.System.exit(0);  退出程序
* 2.arraycopy(src,0,dest,0,3);
* @param      src      the source array.  源数组
* @param      srcPos   starting position in the source array.    源数组的开始索引
* @param      dest     the destination array.  目标数组
* @param      destPos  starting position in the destination data. 目标数组的开始所有原因
* @param      length   the number of array elements to be copied. 拷贝的长度
* 3.currentTimeMillis(),距离1970-01-01的毫秒数
* @author 柴方贵
* @version 创建时间：2022年2月6日 下午10:20:20
*/
public class SystemDemo {
	public static void main(String[] args) {
		System.out.println("ok1");
		//System.exit(0);
		System.out.println("ok2");
		int[] src = {1,2,3,4,5};
		int[] desc = new int[5];
		
		System.arraycopy(src,0,desc,0,src.length);
		System.out.println(desc);
		System.out.println(Arrays.toString(desc));
		System.arraycopy(src,1,desc,0,src.length-1);
		System.out.println(Arrays.toString(desc));
		
		
		System.out.println(System.currentTimeMillis());
	}
}
