package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Video36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();

		while (true) {
			System.out.print("Moi nhap: ");
			Double x = scanner.nextDouble();
			list.add(x);

			System.out.println("Nhap them (Y/N)?");
			String y = scanner.next();
			if (y.equals("N")) {
				break;
			}
		}

		System.out.println("Array: " + list);
		double c = 0;
		for (int i = 0; i < list.size(); i++) {
			c += list.get(i);
		}
		System.out.println("Tong: " + c);
	}
}
