
package cn.cfg.java.DBinterfaceTest;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��26�� ����8:41:37
*/
public class SqlServerConnection implements DBInterface {

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("����Sqlserver���ݿ�����");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�ر�Sqlserver���ݿ�����"); 
	}

}
