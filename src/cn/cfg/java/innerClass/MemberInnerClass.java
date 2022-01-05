
package cn.cfg.java.innerClass;

/**
* 这是成员内部类,类写到成员的位置上
* @author 作者
* @version 创建时间：2022年1月1日 下午10:57:02
*/
public class MemberInnerClass {
	public static void main(String[] args) {
		outer08 o8 = new outer08();
		o8.t1();
	}
	
	
}




class outer08{
	private int n1 = 100;
	public String name = "张三";
	
	class  Inner08{//成员内部类
		public void say() {
			System.out.println("Outer08的n1= "+n1+"outer08的name= "+name );
		}	
	}
	
	
	public void t1() {
		Inner08 in08 = new Inner08();
		in08.say();
	}
	
}