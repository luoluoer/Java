
package cn.cfg.java;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��12�� ����8:27:19
*/
public class SubExtendsDetail_Base extends ExtendsDetail_Base{
	public SubExtendsDetail_Base() {
		//super();Ĭ�ϵ��ø�����޲ι�����
		//�������Ĺ��췽������д,��ô��Ҫ�ֶ�ָ�����õĹ��췽��
		System.out.println("SubExtendsDetail_Base().....");
	}
	
	public void sayOk() {
		System.out.println("THIS IS OK");
		System.out.println(n1+" "+n2+" "+n3);
		//System.out.println(n4);  //n4 ���ܷ��ʵ�
		System.out.println(this.getN4());
	}
}