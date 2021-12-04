
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月4日 下午9:42:41
*/
public class Recursion_Tower {
	public static void main(String[] args) {
		
	}
}



class Tower{
	//num 表示要移动的个数,a,b,c分别表示ABC塔
	//a是移动柱,b是借助柱,c是目标柱
	public void move(int num ,char a ,char b ,char c ) {
		if (1==num) {
			System.out.println(a+"->"+c);
		}else {
			//如果有多个盘子,可以看成两个;最下面的和上面的所有
			//1.先移动上面所有的盘子到B,借助C
			move(num-1,a,c,b);
			//2.把最下面的一个盘,移动到C
			System.out.println(a+"->"+c);
			//3.再把B的所有盘,移动到C,借助A
			move(num-1,b,a,c);
		}
	}
}
