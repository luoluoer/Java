
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月7日 下午4:48:16
*/
public class ContinueTest {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			for (int j = 0;j<10;j++) {
				if (2==j) {
					continue;
					//continue 不影响循环顺序,但是直接回到循环
				}
				System.out.println("j = "+j);
			}
		}
	}
}
