
package cn.cfg.java.innerClass;

/**
* 有个Bell接口,接口有一个ring方法
* 有一个手机类CellPhone,具有闹钟的功能,alarmclock,参数Bell类型
* 测试手机类的闹铃功能,通过匿名内部类作为参数,打印懒猪起床了;
* 再传入一个匿名内部类打印小伙伴上课了
* @author 柴方贵
* @version 创建时间：2022年1月1日 下午10:14:50
*/
public class InnerClassUse02 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.alarmclock(new Bell() {

			@Override
			public void ring() {
				// TODO Auto-generated method stub
				System.out.println("懒猪起床了");
			}
		});
		
		
		cp.alarmclock(new Bell() {

			@Override
			public void ring() {
				// TODO Auto-generated method stub
				System.out.println("小伙伴上课了");
			}
			
		});
	}
}

class CellPhone{
	public void alarmclock(Bell bell) {
		bell.ring();
	}
	
}

interface Bell{
	public void ring();
	
}
