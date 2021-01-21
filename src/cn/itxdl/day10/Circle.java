package cn.itxdl.day10;

public class Circle extends Shape {
	private int r;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y,int r) {
		super(x, y);
		setR(r);
		// TODO Auto-generated constructor stub
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		if(r>0) {
			this.r = r;
		}else {
			System.out.println("不合理");
		}
	}
	@Override
	public void show() {
		super.show();
		System.out.println("半径等于"+r);
	}
	
	

}
