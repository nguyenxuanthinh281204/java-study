package chapter6;

import java.util.Scanner;

public class Video38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap userName: ");
		String username = scanner.next();

		System.out.print("Nhap password: ");
		String password = scanner.next();

		if (username.equals("hoidanit") && password.length() > 6) {
			System.out.println("Hople");
		}
		scanner.close();
	}
}
