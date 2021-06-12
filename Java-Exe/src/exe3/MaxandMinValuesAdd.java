package exe3;

import java.util.Arrays;

public class MaxandMinValuesAdd {

	public static void main(String[] args) {
		int[] arr = {19,17,12};
		Arrays.sort(arr);
		int miniValue = arr[0];
		int maxValue = arr[arr.length -1];
		int sum = miniValue +maxValue;
		System.out.println("Sum ::>> " + miniValue + " + " + maxValue + " = " + sum);
		
	}

}
