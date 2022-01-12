
package cn.cfg.java.ExceptionDemo;

/**
* java有两种异常处理方式:
* 1.try catch finally,如果没有finally  语法也可以通过
* 
* 2.throws 交给调用者处理
* 
* 
* 如果异常发生了,异常后面的内容不会执行 ,直接进入catch块
* finally代码块无论是否异常都会执行
* 可以有多个catch语句,如果发生异常只匹配一个catch
* 
* 也可以使用try   finally   没有catch,这样做的目的是 执行一段代码无论是否发生异常都必须执行一段逻辑
* 这样做是有目的的,例如:释放资源,关闭数据库链接等;但是这样做的话,相当于把异常抛出 交给JVM处理
* @author 柴方贵
* @version 创建时间：2022年1月12日 下午10:43:54
*/
public class ExceptionCatch {
	public static void main(String[] args) {
		try {
			String str = "柴方贵";
			int a = Integer.parseInt(str);
			System.out.println("数字: "+a);
			
			
		}catch(NumberFormatException e ) {
			e.printStackTrace();
			System.out.println("异常信息="+e.getMessage());
		}finally {System.out.println("无论发生了甚么都执行这部分");}
		
		
		//多个catch语句的内容开始,子类异常写在前面,父类异常写在后面  就是说Exception要写在最后

		Person person = new Person();
		try {
			person = null;
			System.out.println(person.getName());
			
			int result = 10/0;
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e ) {
			System.out.println(e.getMessage());
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//多个catch语句的内容结
		
		

		
		
	}

}


class Person{
	private String name ="jack";
	
	public String getName() {
		return name;
	}
}