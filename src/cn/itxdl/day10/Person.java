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
			System.out.println("���䲻����");
		}
	}
	public void show() {
		System.out.println("����");
		
		System.out.println("������"+getName()+",������"+getAge());
	}
	
	public static void test(){
		
		System.out.println("�����еľ�̬����");
	}
    
}
