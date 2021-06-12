package exe15;

public class DisplayUniqueCharacters {
	public static void main(String args[]) {
		String value = "helloworld";
		String uniqueValue = "";

		for (int i = 0; i < value.length(); i++) {
			if (uniqueValue.indexOf(value.charAt(i)) == -1) {
				uniqueValue = uniqueValue + value.charAt(i);
			}
		}
		System.out.println(uniqueValue + " ");
	}
}
