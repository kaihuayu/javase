package cn.itxdl.day11;

public class FixedAccount extends Account {

	public FixedAccount(int i) {
		// TODO Auto-generated constructor stub
		//调用父类有参构造方法 把i传给父类的构造方法 setBalance(balance)
		super(i);
	}

	@Override
	public double getlixi() {
		// TODO Auto-generated method stub
		//计算利息  金额 乘以 利率
		return getBalance()*0.003;
	}
	
	public static void main(String[] Ages) {
		//使用构造方法存入1000元
		Account ac = new FixedAccount(1000);
		System.out.println("利息是"+ ac.getlixi());
		
	}

}
