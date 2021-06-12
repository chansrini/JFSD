package exe4;

public class NumOfWords {
	public static void main(String args[]) {
		int inputVal = Integer.parseInt("3");
		String a[] = {"aa","b","cc","ddd"};
		int cnt=0;
			for(int i=0;i < a.length;i++) {
				int s = a[i].length();
				if(s == inputVal) {
					cnt++;
				}else if(s == inputVal) {
					cnt++;
				}else if(s == inputVal) {
					cnt++;
				}
				
			}
			System.out.println("Number of words of given length ::>> "+ cnt);
	}
}
