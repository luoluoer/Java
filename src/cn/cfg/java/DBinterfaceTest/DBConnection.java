
package cn.cfg.java.DBinterfaceTest;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��26�� ����8:42:38
*/
public class DBConnection {
	public void connectiondatabase(DBInterface db) {
		db.connection();
		db.close();
	}
}
