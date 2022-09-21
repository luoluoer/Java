
package cn.cfg.java.enumtest;

/**
* 这是文档注释
* 这里是枚举类总结:
* 1.是应用enum关键字后不能再继承其他类,因为会隐式的继承Enum类
* 2.enum实现枚举类,本质仍然是个类,所以可以实现接口
* 3.enum实现类,如果枚举内容是空,也必须要有分号,否则报错
* 
* 这里是为了说明枚举类型,使用季节来说明
* 相当于Season类,有SPRING SUMMER AUTUMN WINTER对象
* Season SPRING = new Season("春天","温暖")
* 如果是无参的直接写对象名即可例如 enum Season {SPRING SUMMER AUTUMN WINTER}
* @author 柴方贵
* @version 创建时间：2022年1月3日 下午6:52:01
*/
public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(Season.AUTUMN.getName());
		System.out.println(Season.AUTUMN.getDescription());
		
	}
	
}
enum Season{

	SPRING("春天","温暖"),
	SUMMER("夏天","炎热"),
	AUTUMN("秋天","凉爽"),
	WINTER("冬天","寒冷");
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
