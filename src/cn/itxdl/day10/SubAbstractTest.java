package cn.itxdl.day10;

public class SubAbstractTest extends AbstractTest {
	
	//���������˼���ⱻ�̳У��̳г����������д����ĳ��󷽷�
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("��д���󷽷�");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������͵�����ָ���������͵Ķ���
		SubAbstractTest s = new SubAbstractTest();
		s.show();
		System.out.println("------------------------------------------------");
		// �������͵�����ָ���������͵Ķ��� �γ��˶�̬
		AbstractTest as = new SubAbstractTest();
		as.show();

	}

}
