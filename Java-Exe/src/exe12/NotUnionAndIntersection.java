package exe12;

import java.util.Arrays;

public class NotUnionAndIntersection {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		int c[] = new int[4];

		int aa = 0;
		for (int jj = 0; jj < a.length; jj++) {
			for (int j = 0; j < b.length; j++) {
				if (a[j] != b[j]) {
					c[aa] = a[j];
					System.out.println(c[aa]);
					aa++;
					break;
				}
			}
			//c[aa] = a[jj];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}
}
