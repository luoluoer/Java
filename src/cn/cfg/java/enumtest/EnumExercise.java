
package cn.cfg.java.enumtest;

/**
* �����ĵ�ע��
* @author �񷽹�
* @version ����ʱ�䣺2022��1��6�� ����10:05:50
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
	MONDAY("����һ"),
	TUESDAY("���ڶ�"),
	WENDSDAY("������"),
	THURSDAY("������"),
	FRIDAY("������"),
	SATURDAY("������"),
	SUNDAY("������");
	
	
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