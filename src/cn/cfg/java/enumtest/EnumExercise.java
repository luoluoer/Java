
package cn.cfg.java.enumtest;

/**
* 这是文档注释
* @author 柴方贵
* @version 创建时间：2022年1月6日 下午10:05:50
*/
public class EnumExercise {
	public static void main(String[] args) {
		Week[] weeks = Week.values();
		for(Week week : weeks) {
			System.out.println(week);
		}
	}
}


enum Week{
	MONDAY("星期一"),
	TUESDAY("星期二"),
	WENDSDAY("星期三"),
	THURSDAY("星期四"),
	FRIDAY("星期五"),
	SATURDAY("星期六"),
	SUNDAY("星期日");
	
	
	private String name;
	/**
	 * @param string
	 */
	Week(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
	
	
	
}