
package cn.cfg.java.DBinterfaceTest;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午7:58:55
*/
public class MySqlConnection implements DBInterface{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("我是MySql的数据库链接");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭MySql的数据库链接");
	}

}
