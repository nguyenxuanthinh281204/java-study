package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {

		// tinh the tich V cua hinh lap phuong
		// the tich = canh * canh * canh = canh*3 = Mth.pow(canh,3);

		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap canh: ");
		int canh = scanner.nextInt();

		double theTich = Math.pow(canh, 3);

		System.out.println("The tich = " + theTich);
		scanner.close();

	}
}
