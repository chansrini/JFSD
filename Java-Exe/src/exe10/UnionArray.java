package exe10;

import java.util.Arrays;

public class UnionArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		int c[] = new int[a.length + 2];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int aa = 1;
		for (int j = 0; j < b.length; j++) {
			if (a[j] != b[j]) {
				c[c.length - aa] = b[j];
				aa++;
			}
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}

}
