
package cn.cfg.java.innerClass;

/**
* ���ǳ�Ա�ڲ���,��д����Ա��λ����
* @author ����
* @version ����ʱ�䣺2022��1��1�� ����10:57:02
*/
public class MemberInnerClass {
	public static void main(String[] args) {
		outer08 o8 = new outer08();
		o8.t1();
	}
	
	
}




class outer08{
	private int n1 = 100;
	public String name = "����";
	
	class  Inner08{//��Ա�ڲ���
		public void say() {
			System.out.println("Outer08��n1= "+n1+"outer08��name= "+name );
		}	
	}
	
	
	public void t1() {
		Inner08 in08 = new Inner08();
		in08.say();
	}
	
}