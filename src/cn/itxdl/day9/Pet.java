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
			//��ݼ�alt+/ �Զ��������
			System.out.println("���䲻����");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("����"+getName()+"����"+getAge());
	}
	}