package chapter4;

public class Video28 {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student("Eric", 26);
		st2.setName("Thinh dang buon ngu");
		System.out.println("check obj: " + st2.getName() + " and age = " + st2.getAge());
	}
}
