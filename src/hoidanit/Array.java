package hoidanit;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] clubs = { 10, 1, 3, 16, 5 };

		String[] a = new String[5];
		a[0] = "1";

		Arrays.sort(clubs);

		System.out.println("run here " + Arrays.toString(clubs));
	}
}
