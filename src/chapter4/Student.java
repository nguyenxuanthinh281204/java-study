package chapter4;

public class Student {
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name1) {
		this.name = name1;

	}

	public void learnJava() {
		System.out.println("Learn java");

	}

}
