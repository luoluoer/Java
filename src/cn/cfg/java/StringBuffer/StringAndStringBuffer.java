
package cn.cfg.java.StringBuffer;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��1��24�� ����10:23:12
*/
public class StringAndStringBuffer {
	public static void main(String[] args) {
		//StringתStringBuffer
		String str = "Hellow World";
		//1.��ʽ1
		StringBuffer sb1 = new StringBuffer(str);
		//2.��ʽ2
		StringBuffer sb2 = new StringBuffer();
		sb2.append(str);
		
		//StringBufferתString
		//1.��ʽ1 toString
		StringBuffer sb = new StringBuffer("�񷽹�ѧϰ");
		String strnew = sb.toString();
		//2.ʹ��String������
		String strnew2 = new String(sb);
		//StringBuffer���÷���
		//1.append()
		sb.append(10);
		System.out.println(sb);
		//2.delete()
		sb.delete(1,2);//ǰ�պ�����
		System.out.println(sb);
		//3.replace() 
		sb.replace(1,2,"hahahaha");
		System.out.println(sb);
		//4.indexOf(),ָ�����ַ�����һ�γ��ֵ�����,���û��,��ô����-1
		System.out.println(sb);
		System.out.println(sb.indexOf("ѧϰ"));
		System.out.println(sb.indexOf("����"));
		//5.insert() ,��ָ����λ�ò���
		sb.insert(9,"������");
		System.out.println(sb);
		//6.length(),���س���
		System.out.println(sb.length());
		String s = null;
		StringBuffer ss = new StringBuffer();
		System.out.println("aaaaaaaa");
		System.out.println(ss.append(s).length());//ss.apend������abstractstringbuilder��APPendnull����,���Գ�����4
	}
}
