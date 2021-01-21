package cn.itxdl.day10;

public class Work extends Person {
	private int salary;

	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Work(String name, int age , int salary) {
		super(name, age);
		setSalary(salary);
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 2000) {
			 this.salary=salary;
			}else {
			  System.out.println("工资不合理");	
			}
	}
	
	@Override
	public void show(){
		//super.show();
		System.out.println("薪水是"+getSalary());
	}
	
	public static void test(){
		
		System.out.println("---子类中的静态方法");
	}
	

}
