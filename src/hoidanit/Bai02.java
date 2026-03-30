package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		// chu vi hinh chu nhat
		// dien tich hinh chu nhat
		// canh nho nhat cua hinh chu nhat

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter height: ");
		int a = scanner.nextInt();

		System.out.println("Enter width: ");
		int b = scanner.nextInt();

		int chuvi = (a + b) * 2;
		int dientich = (a * b);
		int canhMin = Math.min(a, b);

		System.out.println(" chu vi: " + chuvi);
		System.out.println(" dien tich: " + dientich);
		System.out.println(" canh nho nhat: " + canhMin);
		scanner.close();
	}
}
