package cn.itxdl.day11;

public class FixedAccount extends Account {

	public FixedAccount(int i) {
		// TODO Auto-generated constructor stub
		//���ø����вι��췽�� ��i��������Ĺ��췽�� setBalance(balance)
		super(i);
	}

	@Override
	public double getlixi() {
		// TODO Auto-generated method stub
		//������Ϣ  ��� ���� ����
		return getBalance()*0.003;
	}
	
	public static void main(String[] Ages) {
		//ʹ�ù��췽������1000Ԫ
		Account ac = new FixedAccount(1000);
		System.out.println("��Ϣ��"+ ac.getlixi());
		
	}

}
