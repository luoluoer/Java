
package cn.cfg.java.DBinterfaceTest;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��26�� ����7:58:55
*/
public class MySqlConnection implements DBInterface{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("����MySql�����ݿ�����");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�ر�MySql�����ݿ�����");
	}

}
