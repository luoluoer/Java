
package cn.cfg.java.DBinterfaceTest;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午8:42:38
*/
public class DBConnection {
	public void connectiondatabase(DBInterface db) {
		db.connection();
		db.close();
	}
}
