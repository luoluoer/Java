
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午7:13:04
*/
public class InterfaceTest {
	public static void main(String[] args) {
		Camera camera = new Camera();
		Phone phone = new Phone ();
		Computer  computer = new Computer();
		computer.working(phone);//手机接入到计算机
	}
}
