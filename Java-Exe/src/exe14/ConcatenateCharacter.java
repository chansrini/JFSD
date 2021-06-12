package exe14;

public class ConcatenateCharacter {

	public static void main(String[] args) {
		String[] s = {"abc","da","ram"};
		s[1] = s[1].concat("$");
		String concatValues = "";
		
		for(int i =0;i<s.length;i++) {
			concatValues = concatValues.concat(s[i].charAt(2)+"");
		}
		System.out.println("Concat Values ==>> "+ concatValues);
	}

}
