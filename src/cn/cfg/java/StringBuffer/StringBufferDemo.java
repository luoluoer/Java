
package cn.cfg.java.StringBuffer;

/**
* StringBuffer��ֱ�Ӹ�����AbstractStringBuilder
* StringBufferʵ����Serializable,��StringBuffer�ɴ��л�
* �ڸ�����, AbstractStringBuffer������char[]  value  ����final
* ��value�������ַ�������,���Դ���ڶ���
* StringBuffer��һ��final��,���ܱ��̳�
* 
* StringBuffer�Ĺ�������Ҫ���ĸ�:
* 1.StringBuffer(), ����һ�������ַ����ַ���������,��ʼ����16���ַ�
* 2.StringBuffer(Charsequence),����һ���ַ���������,��������charsequence��ͬ���ַ�
* ����û��
* 3.StringBuffer(int capacity),����һ���ַ���������,ָ����СΪcapacity
* 4.ͨ����String����һ��StringBuffer
* @author �񷽹�
* @version ����ʱ�䣺2022��1��23�� ����10:58:22
*/
public class StringBufferDemo {
	public static void main(String[] args) {
		//1. 
		StringBuffer sb1 = new StringBuffer();
		//2.������
		//3.
		StringBuffer sb3 = new StringBuffer(20);
		
		StringBuffer sb4 =  new StringBuffer("abcd");
	}
}
