package exe6;

public class StrArrayToString {
	public static void main(String args[]) {
		String s[] = { "Vikas", "Lokesh", "Ashok" };
		StringBuffer sb = new StringBuffer();
		String strArraytoStrValue;
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i] + ",");
		}
		strArraytoStrValue = sb.substring(0, sb.length() - 1).toString();
		System.out.println("strArraytoStrValue ::>> " + strArraytoStrValue);
	}

}
