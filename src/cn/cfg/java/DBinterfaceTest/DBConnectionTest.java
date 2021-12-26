
package cn.cfg.java.DBinterfaceTest;

import java.util.Scanner;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午8:47:28
*/
public class DBConnectionTest {
	public static void main(String[] args) {
		String dbtype = "";
		DBConnection dbc = new DBConnection();
		System.out.println("请输入要连接的数据库类型 Mysql Oracle Sqlserver");
		Scanner sc = new Scanner(System.in);
		dbtype = sc.next();
		if (dbtype.equals("Mysql")) {
			dbc.connectiondatabase(new MySqlConnection());
		}
		if (dbtype.equals("Oracle")) {
			dbc.connectiondatabase(new OracleConnection());
		}
		if (dbtype.equals("Sqlserver")) {
			dbc.connectiondatabase(new SqlServerConnection());
		}
	}
}
