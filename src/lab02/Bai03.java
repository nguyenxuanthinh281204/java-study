package lab02;

import java.util.Scanner;

//	yeu cau nhap vao so dien
//		neu so dien su dung tu 0 den 100, gias so dien la 1000
//		neu so dien 101 (tuc >100), gia moi so dien la 1500
//		so dien <=100 => so tien = so dien *1000
//		so dien >100 => so tien = 100* 1000+(so dien -100) *1500
public class Bai03 {
	public static void main(String[] args) {
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
}
