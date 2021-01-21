package cn.itxdl.day10;

public class Atest {
	//A是个接口类型，因此下面就是接口类型的引用作为方法的形参
	//接口类型的引用指向实现类的对象，实现了多态 A a =new SubA();
    public static void test(A a) {
    	//在编译阶段调用A接口中的show方法,运行时调用实现类中重写的版本
    	a.show();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Atest.test(new A()); //error A是个接口类型比抽象类还抽象，不能创建对象
		Atest.test(new SubA());//传递A 接口的子类参数
		System.out.println("--------------------------");
		
		//接口/父类类型 引用变量名  = new 接口/父类类型（）{方法重写}；
		A ta = new A() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("这里是A 接口的匿名类 中的方法");
				
			}
			
		};
		Atest.test(ta);
	}

}
