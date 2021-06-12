package exe5;

public class SumOfNumbers {
	public static void main(String args[]) {
		String a[] = { "2AA", "12", "ABC", "c1a" };
		int sumOfNumbers = 0;
		for (int i = 0; i < a.length; i++) {
			String s = a[i];
			char chars[] = s.toCharArray();
			for (char c : chars) {
				if (Character.isDigit(c)) {
					sumOfNumbers = sumOfNumbers + Integer.parseInt(String.valueOf(c));
				}
			}

		}
		System.out.println("sumOfNumbers ::: >> " + sumOfNumbers);
	}
}
