
package cn.cfg.java.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��2��7�� ����10:53:44
*/
public class BigTntegerAndBigDecimal {
	public static void main(String[] args) {
		//long l = 123456789123456789123456789l;
		//�����ǳ���,�ᳬ��long���ȵ�ʱ��,��Ҫʹ��bigInteger���д洢;
		BigInteger bint = new BigInteger("123456789123456789123456789");
		System.out.println(bint);
		System.out.println(bint.getClass());
		//2.��BigInteger������������ʱ��Ҫʹ����Ӧ�ķ���,����ֱ��ʹ��+-*/
		//add  subtract multiply divide��������
		System.out.println(bint.add(new BigInteger("3")));
		//���㺯������α�����BigInteger����
		
		
		
		
		//ͬ�� ,��С��λ���㹻��,double���Ͳ���ʱ,��Ҫʹ��BigDecimal
		BigDecimal bdec = new BigDecimal("199.456789123456789123456789");
		System.out.println(bdec);
		//BigDecimal�Ĳ�����ԭ����ȫ������BigInteger,�˴������ظ�
		
		//��Ҫע����ǳ��������п����׳��쳣 arithmeticException�쳣,����ѭ���쳣
		//Ϊ�˱�������ѭ���쳣,��Ҫ��������ʱ,ָ������,����://��ʱ,���������ѭ��С��,�ͻᱣ�����ӵľ���
		System.out.println(bdec.divide(new BigDecimal("1.3"),BigDecimal.ROUND_CEILING));
		
		//����:��ʱ�ᱣ��3λС��,��һ
		//divide��������˵�� ������,����,ȡ����ʽ(��������,��һ,��β)
		System.out.println(bdec.divide(new BigDecimal("1.3"),3,BigDecimal.ROUND_UP));
		
		
	}
}
