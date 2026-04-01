package lab02;

import java.util.Scanner;

//	cho ptrinh ax2 +bx +c =0
//	viet chuong trinh nhap vao 3 so nguyen a,b,c va tinh nghiem cua phtrinh
//	neu a =0 => lam tuong tu bai 1
//	neu a # 0:
//		tinh delta= b^2-4ac
//			neu delta <0 => thbao 'ptrinh vo nghiem'
//			neu delta =0 => thbao 'nghiem kep x = -b/(2*a)
//			neu delta >0 => thbao co 2 nghiem rieng biet
//				x1= (-b + cawn(delta))/(2*a)
//				x2= (-b - cawn(delta))/(2*a)

public class Bai02 {

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giai Phuong Trinh Bac Nhat %dx +%d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phtrinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phtrinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phuong trinh có nghiem =  %.3f ", x);
		}

	}

	public static void main(String[] args) {

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
				System.out.printf("Ptrinh %dx^2 + %dx +%d = 0", a, b, c);
				System.out.printf("Ptrinh co 2 nghie rieng biet %.3f va %.3f", x1, x2);

			}
		}

		scanner.close();
	}
}
