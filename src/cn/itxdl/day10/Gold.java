package cn.itxdl.day10;

public class Gold implements Money, Metal {

	@Override
	public void shine() {
		// TODO Auto-generated method stub
		System.out.println("放出了金色的光芒");

	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("买了很多东西");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 接口类型的引用指向实现类的对象，形成了多态；
		Metal mt = new Gold();
		mt.shine();
		System.out.println("------------------------");
		Money m = new Gold();
		m.buy();

	}

}
