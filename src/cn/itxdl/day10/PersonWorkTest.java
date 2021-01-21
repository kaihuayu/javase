package cn.itxdl.day10;

public class PersonWorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 声明父类类型的引用指向父类类型的对象
		Person p =new Person("zanngfei",30);
		//当子类没有重写show方法时，下面调用父类的show方法
		p.show();
		//声明子类类型的引用指向子类类型的对象
		Work w = new Work("guangyu",32,2001);
		//当子类没有重写show方法时，下面调用父类的show方法,有就调用子类的show
		w.show();
		//声明父类类型的引用指向子类类型的对象，形成多态
		Person pw = new Work("liubei",35,2100);
		//当子类没有重写show方法时，下面调用父类的show方法 有就调用子类的show
		// 1.在编译阶段调用父类中的show方法，在运行阶段调用子类中重写的show
		pw.show();
		
		System.out.println("---------------------------------------------------------------------");
		//父类的引用是否能够调用父类独有的方法以及子类独有的方法
		String str = pw.getName();
		//2.当父类的引用指向子类的对象时。父类的引用可以直接调用父类独有的方法
		System.out.println("获取到的姓名" +str);
		//3.当父类的引用指向子类的对象时。父类的引用不能直接调用子类独有的方法
		//4.对于父子类都有的非静态成员方法来说，编译阶段调用父类的版本，执行的时候调用子类重写的方法
		//5.对于父子类都有静态成员方法来说，编译和运行都调用父类的版本，隶属于类层级，因此与指向的对象无关
		pw.test(); //斜体字表示是静态方法
		Person.test();//用类名 . 方法  访问  （推荐）
		
		System.out.println("---------------------------------------------------------------------");
		//6.若希望父类引用可以调用子类独有的方法，则需要强制类型转换
		int  num =((Work) pw).getSalary();//将pw 强制转换成 work
		System.out.println("薪水是"+num);

		/*1.4引用数据类型之间的转换

		1）引用数据类型之间的转换分为：自动类型转换 和 强制类型转换；

			其中自动类型的转换主要指从小范围到大范围之间的转换，也就是子类到父类的转换。

			其中强制类型转换主要指从大范围到小范围之间的转换，也就是从父类到子类的转换。
			
			引用数据类型之间的转换必须发生在父子之间，否则编译报错  */
		//Teacher t = (Teacher)pw;  //java.lang.ClassCastException  类型转换异常  编译通过运行错误  编译阶段PW是Person类型，运行时PW是Work类型
		  //  若转换到的目标类型是子类类型，但不是该引用真正指向子类类型，则编译通过，运行类型转换报错。
		// 使用instanceof 判断引用变量指向的对象是否为后面的类型
		if(pw instanceof Teacher) { // 判断类型是否可以强制转换
			System.out.println("可以转换");
		}else {
			System.out.println("不可以转换");
			
		}
	}

}
