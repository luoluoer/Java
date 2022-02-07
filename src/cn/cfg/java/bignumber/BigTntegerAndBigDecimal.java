
package cn.cfg.java.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年2月7日 下午10:53:44
*/
public class BigTntegerAndBigDecimal {
	public static void main(String[] args) {
		//long l = 123456789123456789123456789l;
		//当数非常大,会超过long长度的时候,需要使用bigInteger进行存储;
		BigInteger bint = new BigInteger("123456789123456789123456789");
		System.out.println(bint);
		System.out.println(bint.getClass());
		//2.对BigInteger进行四则运算时需要使用相应的方法,不能直接使用+-*/
		//add  subtract multiply divide四则运算
		System.out.println(bint.add(new BigInteger("3")));
		//运算函数的入参必须是BigInteger类型
		
		
		
		
		//同理 ,当小数位数足够多,double类型不够时,需要使用BigDecimal
		BigDecimal bdec = new BigDecimal("199.456789123456789123456789");
		System.out.println(bdec);
		//BigDecimal的操作与原理完全类似于BigInteger,此处不再重复
		
		//需要注意的是除法运算有可能抛出异常 arithmeticException异常,无限循环异常
		//为了避免无限循环异常,需要在做除法时,指定精度,如下://此时,如果有无限循环小数,就会保留分子的精度
		System.out.println(bdec.divide(new BigDecimal("1.3"),BigDecimal.ROUND_CEILING));
		
		//如下:此时会保留3位小数,进一
		//divide三个参数说明 被除数,精度,取数方式(四舍五入,进一,舍尾)
		System.out.println(bdec.divide(new BigDecimal("1.3"),3,BigDecimal.ROUND_UP));
		
		
	}
}
