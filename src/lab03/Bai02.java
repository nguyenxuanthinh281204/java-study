package lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap vao 1 so nguyen bat ky: ");
		int x = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x % d = %d", x, i, x * i);
			System.out.println();

		}
		scanner.close();
	}
}
