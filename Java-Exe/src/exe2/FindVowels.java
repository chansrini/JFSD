package exe2;

public class FindVowels {

	public static void main(String[] args) {
		String value = "NewyorkE";
		int len = value.length();
		int cnt = 0;
				for(int i =0; i<len ; i++) {
					if( value.charAt(i) == 'e' || value.charAt(i) == 'E'){
						cnt++;
					}
				}
		System.out.println("Vowel E char Count ::>> "+ cnt);
	}

}
