package cn.itxdl.day11;

public class TestInface {
	//ʹ��InterfaceA �ӿ��β�
	public int sum(InterfaceA m) {
		return m.method(10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInface s= new TestInface();
		System.out.println("�������"+s.sum(new ClassA())); //����A�����д����  �ۼ�
		System.out.println("�������"+s.sum(new ClassB())); //����B�����д���� �׳�

	}

}
