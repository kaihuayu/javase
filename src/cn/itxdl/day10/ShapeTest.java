package cn.itxdl.day10;
//��̬��ʵ���������ڿ������β�ͬ����Ĳ�����ʵ��ͨ�õı�̣������Ե��ò�ͬ�ķ���������ͬ�Ľ��
public class ShapeTest {

	//�Զ����Ա����ʵ�ֲ���ָ�����������Ĵ�ӡ
	//�������͵�����ָ������Լ��Ķ���
	// Rect r =new Rect(1,2,3,4) 
	public static void draw(Rect r) {
		r.show();
		
	}
	
	//�Զ����Ա����ʵ�ֲ���ָ��Բ�εĴ�ӡ
	//Բ�����͵�����ָ��Բ�εĶ���
	//Circle c new Circle(2,4,6);
	public static void draw(Circle c) {
		c.show();
	} 
	
	//�Զ����Ա����ʵ�־��Σ�Բ�ε�������ӡ
	public static void draw(Shape d) {
		d.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest.draw(new Rect(1,2,3,4));
		System.out.println("-------------------------------");
		ShapeTest.draw(new Circle(2,4,6));
		System.out.println("-------------------------------");
		ShapeTest.draw(new Rect(7,8,9,10)); //��ӡ���� ͼ�ε�����ָ����εĶ��� Shape d= Rect(7,8,9,10) ��������ָ������Ķ��󣨶�̬��;
		System.out.println("-------------------------------");
		ShapeTest.draw(new Circle(6,8,9));//��ӡԲ�Σ�ͼ��Shape������ָ��Բ�εĶ��� Shape d=Circle(6,8,9) ��̬  
		System.out.println("-------------------------------");
		ShapeTest.draw(new Shape(12,13));

	}

}
