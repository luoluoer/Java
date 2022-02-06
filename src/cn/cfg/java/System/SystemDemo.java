
package cn.cfg.java.System;

import java.util.Arrays;

/**
* 1.System.exit(0);  �˳�����
* 2.arraycopy(src,0,dest,0,3);
* @param      src      the source array.  Դ����
* @param      srcPos   starting position in the source array.    Դ����Ŀ�ʼ����
* @param      dest     the destination array.  Ŀ������
* @param      destPos  starting position in the destination data. Ŀ������Ŀ�ʼ����ԭ��
* @param      length   the number of array elements to be copied. �����ĳ���
* 3.currentTimeMillis(),����1970-01-01�ĺ�����
* @author �񷽹�
* @version ����ʱ�䣺2022��2��6�� ����10:20:20
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
