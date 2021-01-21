package cn.itxdl.day10;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}else {
			System.out.println("年龄不合理");
		}
	}
	public void show() {
		System.out.println("父类");
		
		System.out.println("姓名是"+getName()+",年龄是"+getAge());
	}
	
	public static void test(){
		
		System.out.println("父类中的静态方法");
	}
    
}
