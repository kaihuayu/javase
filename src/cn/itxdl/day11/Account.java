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
			System.out.println("不合理");
		}
	}
	//提供一个抽象方法返回利息
	public abstract double getlixi();
	//abstract 关键字和final关键字不能共同修饰一个方法 final不能被重写
	//public abstract final double getlixi();
	//abstract 关键字和 static 关键字不能共同修饰一个方法。抽象方法不能被直接调用 static 可以使用类名.调用
	//public abstract static double getlixi();
	//private 和 abstract 不能共同修饰一个放，private 修饰的方法不能被继承
	//private abstract double getlixi();

}
