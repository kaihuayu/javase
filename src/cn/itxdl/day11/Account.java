package cn.itxdl.day11;

public abstract class Account {
	private int balance;
	

	public Account() {
		super();
	}

	public Account(int balance) {
		super();
		setBalance(balance);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>0) {
		this.balance = balance;
		}else {
			System.out.println("������");
		}
	}
	//�ṩһ�����󷽷�������Ϣ
	public abstract double getlixi();
	//abstract �ؼ��ֺ�final�ؼ��ֲ��ܹ�ͬ����һ������ final���ܱ���д
	//public abstract final double getlixi();
	//abstract �ؼ��ֺ� static �ؼ��ֲ��ܹ�ͬ����һ�����������󷽷����ܱ�ֱ�ӵ��� static ����ʹ������.����
	//public abstract static double getlixi();
	//private �� abstract ���ܹ�ͬ����һ���ţ�private ���εķ������ܱ��̳�
	//private abstract double getlixi();

}
