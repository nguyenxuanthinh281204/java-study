package lab02;

import java.util.Scanner;

public class Bai04 {

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		Scanner scanner = new Scanner(System.in);

		if (a == 0 && b == 0) {
			System.out.println("Phtrinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phtrinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("Giai Phuong Trinh Bac Nhat %dx +%d = 0 \n", a, b);
			System.out.printf("Phuong trinh có nghiem =  %.3f ", x);
		}
		scanner.close();

	}

	public static void giaiPhuongTrinhBacHai() {
		System.out.println(">> Lua chon tinh nang 2 <<");

		Scanner scanner = new Scanner(System.in);

		System.out.println("moi nhap a ");
		int a = scanner.nextInt();

		System.out.println("moi nhap b ");
		int b = scanner.nextInt();

		System.out.println("moi nhap c ");
		int c = scanner.nextInt();

		if (a == 0) {

			giaiPhuongTrinhBacNhat(b, c);
		} else {
			int delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Ptrinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Ptrinh %dx^2 + %dx +%d = 0 \n", a, b, c);
				System.out.printf("Ptrinh co nghiem kep x = %.3f", x);
			} else {
				Double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				Double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Ptrinh %dx^2 + %dx +%d = 0 \n", a, b, c);
				System.out.printf("Ptrinh co 2 nghie rieng biet %.3f va %.3f", x1, x2);

			}
		}

		scanner.close();
	}

	public static void tinhTienDien() {
		System.out.println(">> Lua chon tinh nang 3 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap so dien");
		int soDien = scanner.nextInt();

		if (soDien <= 100) {
			int soTien = soDien * 1000;
			System.out.printf("so tien cua %d la %d", soDien, soTien);
		} else {
			int SoTien = 100 * 1000 + (soDien - 100) * 1500;
			System.out.printf("so tien cua %d la %d", soDien, SoTien);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>LUA CHON TINH NANG<<");
		System.out.println("++------------------++");
		System.out.println("|1. giai phuong trinh bac nhat  |");
		System.out.println("|2. giai phuong trinh bac hai   |");
		System.out.println("|3. tinh so tien dien           |");
		System.out.println("|4. ket thuc                    |");
		System.out.println("++------------------++");
		System.out.print("Lua chon cua ban: ");

		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Nhap a: ");
			int a = scanner.nextInt();
			System.out.println("Nhap b: ");
			int b = scanner.nextInt();
			giaiPhuongTrinhBacNhat(a, b);
			break;
		case 2:

			giaiPhuongTrinhBacHai();
			break;
		case 3:

			tinhTienDien();
			break;
		default:
			System.out.println("Ban da thoat chuong trinh");
			System.exit(0);
		}

		scanner.close();
	}
}
