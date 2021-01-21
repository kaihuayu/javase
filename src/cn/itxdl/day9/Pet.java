package cn.itxdl.day9;

public class Pet {
	private String name;
	private int age;

	public int getAge() {
		return age;
	}	
	public Pet() {
		super();
	}
	public Pet(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
	public void setAge(int age) {
		if (age>0) {
		this.age = age;
		}else {
			//快捷键alt+/ 自动补齐代码
			System.out.println("年龄不合理");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("名字"+getName()+"年龄"+getAge());
	}
	}