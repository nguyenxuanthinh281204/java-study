package lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nuyen bat ky: ");
		int value = scanner.nextInt();

		int count = 0;
		for (int i = 2; i <= value - 1; i++) {
			if (value % i == 0) {
				System.out.println("Uoc so khac: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to ", value);
		} else {
			System.out.printf("%d khong phai la so nguyen to ", value);
		}
		scanner.close();
	}
}
