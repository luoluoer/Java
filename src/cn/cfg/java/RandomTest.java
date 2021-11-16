
package cn.cfg.java;


/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年11月7日 下午4:23:54
*/
public class RandomTest {
	public static void main(String[] args) {
		int i = 0;
		int flag = 0;
		
		while (true) {
			
			i =(int)( Math.random()*100)+1;
			if (97==i) {
				flag ++;
				System.out.println("第"+flag+"次的时候达到97");
				break;
			}
			System.out.println(i);
			flag++;
			
		}
	}
}
