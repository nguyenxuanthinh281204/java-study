package hoidanit;

import java.util.Scanner;

public class Swich2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(">> Lua chon tinh nang");
		System.out.println("++-----------------++");
		System.out.println("|1. Cong             |");
		System.out.println("|2. Tru              |");
		System.out.println("|3. Ket thuc         |");
		System.out.println("++-----------------++");

		System.out.println("Lua chon cua ban laf: ");

		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("ban da lua chon phep cong");
			break;
		case 2:
			System.out.println("ban da lua chon phep tru");
			break;
		case 3:
			System.out.println("ban da lua chon thoat chuong trinh");
			System.exit(0);
		}

		scanner.close();

	}
}
