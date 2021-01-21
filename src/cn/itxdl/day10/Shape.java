package cn.itxdl.day10;

public class Shape {
	private int x;
	private int y;
	public Shape(int x, int y) {
		super();
		setX(x);
	    setY(y);
	}
	
	public Shape() {
		super();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.println("x="+getX()+"y="+getY());
		
	}
	

}
