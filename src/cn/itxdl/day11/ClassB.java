package cn.itxdl.day11;

public class ClassB implements InterfaceA {

	@Override
	public int method(int n) {
		// TODO Auto-generated method stub
		//½×³Ë
		int m =1;
		for (int i =1 ; i<=n  ; i++) {
			m=m*i;
		}
		return m;
	}
	
	/*
	 * public static void main(String[] Arges) { ClassB b= new ClassB();
	 * System.out.println(b.method(10)); }
	 */
}
