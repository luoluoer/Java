
package innerClass;

/**
* 1.����,ʹ��IA�ӿڲ���������
* 2.��ͳ��ʽ��,дһ����ʵ�ֽӿ�,����������
* 3.���ڵ�������Tiger��ֻ����һ��,���治��ʹ��
* 4.����ʹ�������ڲ������򻯿���
* 5.tiger�ı���������IA,���������������ڲ���
* @author �񷽹�
* @version ����ʱ�䣺2021��12��29�� ����11:21:04
*/
public class noNameClass {
	public static void main(String[] args) {
		Outer04 o4 = new Outer04();
		o4.method();
	}
}




class Outer04{
	private int n1 = 100;
	public  void method() {
		//�����ڲ��࿪ʼ
		
		//����Ĵ����൱��class tiger$1implment IA ,Ȼ����дIA��cry����
		/*
		 class outer94$1 implement IA{
		 	public void cry(){System.out.println("�ϻ�����������");}
		 }
		  */
		IA tiger = new IA() {
			public void cry() {
				System.out.println("�ϻ�����������");
			}
		};//�˴��зֺ�,����ע��
		//�����ڲ������
		tiger.cry();
		System.out.println("tiger�������ڴ���"+tiger.getClass());
		//�ڶ��������ڲ��࿪ʼ  ����ʵ����������ڲ���
		Father f = new Father("jack") {
			//�������п���������д����Father�ķ���,��Ȼ�˴��ǿյķ�����
			//new Father("jack") �Ὣjack������Ӧ�Ĺ�����
		};
		//�ڶ��������ڲ������
		//�൱��˵ �����ڲ�����������ʽ 
		//�����ڲ����һ�� �ӿ� ������ = new �ӿ�(){}
		//�����ڲ���ڶ��� ���� ������ = new ����(){}
		System.out.println("f������������"+f.getClass());
		//�����������ڲ��࿪ʼ,���ڳ�����������ڲ���
		 new Animal() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("������������ڲ���");
			}
			
		};
		
		//�����������ڲ������,���ڳ�����������ڲ���
	}
}

interface IA{
	public void cry();
}



class Father {
	public Father(String name) {
		super();
	}
	public void test() {}
}


abstract class Animal{
	abstract void eat() ;
}

