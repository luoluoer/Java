
package cn.cfg.java.DBinterfaceTest;

import java.util.Scanner;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��26�� ����8:47:28
*/
public class DBConnectionTest {
	public static void main(String[] args) {
		String dbtype = "";
		DBConnection dbc = new DBConnection();
		System.out.println("������Ҫ���ӵ����ݿ����� Mysql Oracle Sqlserver");
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
