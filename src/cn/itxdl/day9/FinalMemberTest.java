package cn.itxdl.day9;

public class FinalMemberTest {
	
	private final int cnt =1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMemberTest fmt = new FinalMemberTest();
		System.out.println("成员方法测试"+fmt.cnt);
		//fmt.cnt =2; error

	}

}
