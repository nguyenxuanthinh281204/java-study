package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
//		viet chuong trinh nhap vao 2 so nguyen a,b. tinh nghiem cua phtrinh
//		neu a =0, b=0 => thong bao - Phtrinh co vo so nghiem
//		neu a=0, b#0 => thong bao - Phtrinh vo nghiem
//		con lai x=-b/a => thong bao - x=?

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();

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
}
