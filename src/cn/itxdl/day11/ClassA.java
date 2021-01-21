package cn.itxdl.day11;

public class ClassA implements InterfaceA {

	@Override
	public int method(int n) {
		// TODO Auto-generated method stub
		//¿€º” m+ =i;
		int m = 0;
		for (int i=1;i<= n;i++) {
			// m  = m+i;
			m=m+i;
			
		};
		return m;
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * ClassA c = new ClassA(); System.out.println(c.method(100));
	 * 
	 * }
	 */

}
