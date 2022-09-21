
package cn.cfg.java.enumtest;

/**
* �����ĵ�ע��
* ������ö�����ܽ�:
* 1.��Ӧ��enum�ؼ��ֺ����ټ̳�������,��Ϊ����ʽ�ļ̳�Enum��
* 2.enumʵ��ö����,������Ȼ�Ǹ���,���Կ���ʵ�ֽӿ�
* 3.enumʵ����,���ö�������ǿ�,Ҳ����Ҫ�зֺ�,���򱨴�
* 
* ������Ϊ��˵��ö������,ʹ�ü�����˵��
* �൱��Season��,��SPRING SUMMER AUTUMN WINTER����
* Season SPRING = new Season("����","��ů")
* ������޲ε�ֱ��д�������������� enum Season {SPRING SUMMER AUTUMN WINTER}
* @author �񷽹�
* @version ����ʱ�䣺2022��1��3�� ����6:52:01
*/
public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(Season.AUTUMN.getName());
		System.out.println(Season.AUTUMN.getDescription());
		
	}
	
}
enum Season{

	SPRING("����","��ů"),
	SUMMER("����","����"),
	AUTUMN("����","��ˬ"),
	WINTER("����","����");
	private String name ;
	private String description;
	/**
	 * @param name
	 * @param description
	 */
	Season(String name, String description) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
	
}
