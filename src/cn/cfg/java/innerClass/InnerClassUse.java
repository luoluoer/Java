
package cn.cfg.java.innerClass;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2022年1月1日 下午9:55:46
*/
public class InnerClassUse {
	public static void main(String[] args) {
		f1(new ICTest() {
			public void saylang() {
				System.out.println("匿名内部类应用");
			}  
			}
		);
	}
	public static void f1(ICTest ict){
		ict.saylang();
	};
}



interface ICTest{
	public void saylang();
}


//传统方式
/*
 * class InnerClassUse$1 implements ICTest{
 * public void saylang(){
 * System.out.println("匿名内部类应用");
 * }
 * }
 * 然后在用对象调用
 * f1(new InnerClassUse$1)
 * */