package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name of Student: ");
		String name = scanner.nextLine();

		System.out.println("Enter Point: ");
		float point = scanner.nextFloat();

		System.out.println(" " + name + " co diem = " + Math.ceil(point));

		scanner.close();
	}
}
