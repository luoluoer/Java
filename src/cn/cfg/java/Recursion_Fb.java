
package cn.cfg.java;

/**
* 这是文档注释  斐波那切数列
* 1 1,2,3,5,8,13
* @author 作者
* @version 创建时间：2021年12月4日 下午9:10:53
*/
public class Recursion_Fb {
	public static void main(String[] args) {
		FB f = new FB();
		System.out.println(f.FB_num(5));
	}
}


class FB{
	int FB_num (int i ) {
		if (i>=3) {
			return FB_num(i-1)+FB_num(i-2);
		}else if (1==i||2==i){
			return 1;
			}else {return 0;}
	}
	
}
