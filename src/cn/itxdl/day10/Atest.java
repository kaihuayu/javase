package cn.itxdl.day10;

public class Atest {
	//A�Ǹ��ӿ����ͣ����������ǽӿ����͵�������Ϊ�������β�
	//�ӿ����͵�����ָ��ʵ����Ķ���ʵ���˶�̬ A a =new SubA();
    public static void test(A a) {
    	//�ڱ���׶ε���A�ӿ��е�show����,����ʱ����ʵ��������д�İ汾
    	a.show();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Atest.test(new A()); //error A�Ǹ��ӿ����ͱȳ����໹���󣬲��ܴ�������
		Atest.test(new SubA());//����A �ӿڵ��������
		System.out.println("--------------------------");
		
		//�ӿ�/�������� ���ñ�����  = new �ӿ�/�������ͣ���{������д}��
		A ta = new A() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("������A �ӿڵ������� �еķ���");
				
			}
			
		};
		Atest.test(ta);
	}

}
