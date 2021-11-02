
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月2日 下午10:48:14
*/
public class StringtoBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1+"";
		String s2 = f1 + "";
		String s3 =  d1 +"";
		String s4 = b1+"";
		System.out.println(s1+" "+s2+" "+s3+" "+s4  );
		
		
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		System.out.println();
		
		double num2 = Double.parseDouble(s5);
		System.out.println(num2);
		
		float num3 = Float.parseFloat(s5);
		System.out.println(num3);
		
		long num4 = Long.parseLong(s5);
		System.out.println(num4);
		
		byte num5 = Byte.parseByte(s5);
		System.out.println(num5);
		
		boolean b = Boolean.parseBoolean("true");
		
		short num6 = Short.parseShort(s5);
		System.out.println(num6);
	}

}
