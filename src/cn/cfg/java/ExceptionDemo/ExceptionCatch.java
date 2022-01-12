
package cn.cfg.java.ExceptionDemo;

/**
* java�������쳣����ʽ:
* 1.try catch finally,���û��finally  �﷨Ҳ����ͨ��
* 
* 2.throws ���������ߴ���
* 
* 
* ����쳣������,�쳣��������ݲ���ִ�� ,ֱ�ӽ���catch��
* finally����������Ƿ��쳣����ִ��
* �����ж��catch���,��������쳣ֻƥ��һ��catch
* 
* Ҳ����ʹ��try   finally   û��catch,��������Ŀ���� ִ��һ�δ��������Ƿ����쳣������ִ��һ���߼�
* ����������Ŀ�ĵ�,����:�ͷ���Դ,�ر����ݿ����ӵ�;�����������Ļ�,�൱�ڰ��쳣�׳� ����JVM����
* @author �񷽹�
* @version ����ʱ�䣺2022��1��12�� ����10:43:54
*/
public class ExceptionCatch {
	public static void main(String[] args) {
		try {
			String str = "�񷽹�";
			int a = Integer.parseInt(str);
			System.out.println("����: "+a);
			
			
		}catch(NumberFormatException e ) {
			e.printStackTrace();
			System.out.println("�쳣��Ϣ="+e.getMessage());
		}finally {System.out.println("���۷�������ô��ִ���ⲿ��");}
		
		
		//���catch�������ݿ�ʼ,�����쳣д��ǰ��,�����쳣д�ں���  ����˵ExceptionҪд�����

		Person person = new Person();
		try {
			person = null;
			System.out.println(person.getName());
			
			int result = 10/0;
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e ) {
			System.out.println(e.getMessage());
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//���catch�������ݽ�
		
		

		
		
	}

}


class Person{
	private String name ="jack";
	
	public String getName() {
		return name;
	}
}