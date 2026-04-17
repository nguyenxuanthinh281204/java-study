package chapter4;

public class Video23 {
	public static void main(String[] args) {
		System.out.println("run video 23");
		Student st1 = new Student();
		Student st2 = new Student("Hoang", 20);
		st1.name = "Eric";
		st1.age = 25;

		System.out.println("student with name = " + st1.name + " and age = " + st1.age);
		st1.learnJava();
		System.out.println(" " + st2.age);

	}
}
