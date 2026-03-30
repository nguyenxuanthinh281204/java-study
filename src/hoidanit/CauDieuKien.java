package hoidanit;

import java.util.Scanner;

public class CauDieuKien {

//	duoi 10M: khong dong thue
//	tu 10M toi 15M: thue 10
//	tu 15 den 30M: thue 20
//	tren 30M: thue 50

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap tax: ");
		int tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("ko dong thue");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("thue 10%");
		} else if (15 <= tax && tax <= 30) {
			System.out.println("thue 20%");
		} else {
			System.out.println("thue 50%");
		}

		scanner.close();
	}

}
