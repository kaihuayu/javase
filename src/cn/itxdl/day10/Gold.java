package cn.itxdl.day10;

public class Gold implements Money, Metal {

	@Override
	public void shine() {
		// TODO Auto-generated method stub
		System.out.println("�ų��˽�ɫ�Ĺ�â");

	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("���˺ܶණ��");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ӿ����͵�����ָ��ʵ����Ķ����γ��˶�̬��
		Metal mt = new Gold();
		mt.shine();
		System.out.println("------------------------");
		Money m = new Gold();
		m.buy();

	}

}
