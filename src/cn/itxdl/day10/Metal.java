package cn.itxdl.day10;

public interface Metal {
	//自定义抽象方法来描述发光的行为
	public abstract void shine();
	
	//让接口中增加的方法不影响实现类
	public default void test() {
		System.out.println("这个方法是否重写在于你的需要");
	}

}
