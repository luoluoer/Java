
package cn.cfg.java.DBinterfaceTest;

/**
* �����ĵ�ע��
* @author ����
* @version ����ʱ�䣺2021��12��26�� ����8:40:36
*/
public class OracleConnection implements DBInterface {

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("����Oracle����");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�ر�Oracle����");
	}

}
