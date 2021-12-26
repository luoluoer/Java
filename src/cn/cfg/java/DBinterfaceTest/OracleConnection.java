
package cn.cfg.java.DBinterfaceTest;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午8:40:36
*/
public class OracleConnection implements DBInterface {

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("这是Oracle链接");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭Oracle链接");
	}

}
