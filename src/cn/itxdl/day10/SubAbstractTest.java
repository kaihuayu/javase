package cn.itxdl.day10;

public class SubAbstractTest extends AbstractTest {
	
	//抽象类的意思在意被继承；继承抽象类必须重写父类的抽象方法
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("重写抽象方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//子类类型的引用指向子类类型的对象
		SubAbstractTest s = new SubAbstractTest();
		s.show();
		System.out.println("------------------------------------------------");
		// 父类类型的引用指向子类类型的对象 形成了多态
		AbstractTest as = new SubAbstractTest();
		as.show();

	}

}
