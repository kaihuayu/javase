package cn.itxdl.day10;

public class Rect extends Shape {
	private int width;
	private int heigth;

	public Rect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rect(int x, int y,int wid, int hei) {
		super(x, y);
		// TODO Auto-generated constructor stub
		setWidth(wid);
		setHeigth(hei);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width>0) {
			this.width = width;
		}else {
			System.out.println("宽度数值不合理");
		}
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		if(heigth>0){
			this.heigth = heigth;
		}else {
			System.out.println("长度数值不合理");
		};
	}

	@Override
	public void show() {
		
		System.out.println("宽等于"+getWidth()+"长度等于"+getHeigth()+"坐标等于"+getX()+"-"+getY());
	}

}
