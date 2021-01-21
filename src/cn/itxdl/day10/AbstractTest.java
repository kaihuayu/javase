package cn.itxdl.day10;
//抽象类抽象方法

public abstract class AbstractTest {
    private int cnt;
    
	public AbstractTest() {
		super();
	}

	public AbstractTest(int cnt) {
		super();
		setCnt(cnt);
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public abstract void show();// 抽象方法

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	AbstractTest at = new AbstractTest();

	}

}
