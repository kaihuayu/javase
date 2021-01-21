package cn.itxdl.day10;
//多态的实际意义在于可以屏蔽不同子类的差异性实现通用的编程，但可以调用不同的方法带来不同的结果
public class ShapeTest {

	//自定义成员方法实现参数指定矩形特征的打印
	//矩形类型的引用指向矩形自己的对象
	// Rect r =new Rect(1,2,3,4) 
	public static void draw(Rect r) {
		r.show();
		
	}
	
	//自定义成员方法实现参数指定圆形的打印
	//圆形类型的引用指向圆形的对象
	//Circle c new Circle(2,4,6);
	public static void draw(Circle c) {
		c.show();
	} 
	
	//自定义成员方法实现矩形，圆形的特征打印
	public static void draw(Shape d) {
		d.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest.draw(new Rect(1,2,3,4));
		System.out.println("-------------------------------");
		ShapeTest.draw(new Circle(2,4,6));
		System.out.println("-------------------------------");
		ShapeTest.draw(new Rect(7,8,9,10)); //打印矩形 图形的引用指向矩形的对象 Shape d= Rect(7,8,9,10) 父类引用指向子类的对象（多态）;
		System.out.println("-------------------------------");
		ShapeTest.draw(new Circle(6,8,9));//打印圆形，图形Shape的引用指向圆形的对象 Shape d=Circle(6,8,9) 多态  
		System.out.println("-------------------------------");
		ShapeTest.draw(new Shape(12,13));

	}

}
