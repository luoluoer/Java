
package cn.cfg.java.DBinterfaceTest;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午8:41:37
*/
public class SqlServerConnection implements DBInterface {

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("我是Sqlserver数据库链接");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭Sqlserver数据库链接"); 
	}

}
