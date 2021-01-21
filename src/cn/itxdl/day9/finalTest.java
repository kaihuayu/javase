package cn.itxdl.day9;

/*ctrl+shift+/多行注释*/
/*ctrl+shift+\取消多行注释*/
public /* final */ class finalTest {
	//类加上final 不能被继承
	//final关键字修饰成员方法表示该方法不能被重写。但可以被继承。
	public /* final */ void show() {
	   
	   System.out.println("final 成员方法测试");
   }
}
