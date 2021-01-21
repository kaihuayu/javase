package cn.itxdl.day11;

public class TestInface {
	//使用InterfaceA 接口形参
	public int sum(InterfaceA m) {
		return m.method(10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInface s= new TestInface();
		System.out.println("结果等于"+s.sum(new ClassA())); //调用A类的重写方法  累加
		System.out.println("结果等于"+s.sum(new ClassB())); //调用B类的重写方法 阶乘

	}

}
