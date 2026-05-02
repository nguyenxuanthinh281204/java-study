package chapter6;

import java.util.ArrayList;

public class Student {
	private String name;
	private int id;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("Nguyen Xuan Thinh", 28));
		st.add(new Student("Vu Phuong Thao", 27));
		st.add(new Student("Nguyen Thanh Tung", 27));
		st.add(new Student("Nguyen Dang Viet", 12));
		st.add(new Student("Pham Duy Anh", 12));

		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).getName().startsWith("Nguyen")) {
				System.out.println(st.get(i));
			}
		}
	}

}
