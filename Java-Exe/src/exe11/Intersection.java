package exe11;

import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		int c[] = new int[2];

		int aa = 0;
		for (int jj = 0; jj < a.length; jj++) {
			for (int j = 0; j < b.length; j++) {
				if (a[jj] == b[j]) {
					c[aa] = b[j];
					aa++;
				}
			}
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}
}
