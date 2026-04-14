package hoidanit;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] clubs = { 10, 1, 3, 16, 5 };

		Arrays.sort(clubs);

		System.out.println("run here " + Arrays.toString(clubs));

		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = 0; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[j] = clubs[i];
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));
	}
}
