package exe7;

public class EmailValidation {

	public static void main(String[] args) {
		String email = "test@gmail.com";
		int cnt = 0;
		boolean emailValidation = false;
		if (email.contains("@") && email.contains(".")) {
			emailValidation = true;
		}

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				cnt++;
			}
		}
		if (cnt == 1) {
			emailValidation = true;
		} else {
			emailValidation = false;
		}

		String emailSubstring = email.substring(email.indexOf("@") + 1, email.indexOf("."));
		if (emailSubstring.length() == 5) {
			emailValidation = true;
		} else {
			emailValidation = false;
		}

		String beforeValue = email.substring(0, email.indexOf("@"));
		if (beforeValue.length() > 3) {
			emailValidation = true;
		} else {
			emailValidation = false;
		}

		if (email.endsWith(".com")) {
			emailValidation = true;
		} else {
			emailValidation = false;
		}

		System.out.println("emailValidation ::>>" + emailValidation);
	}

}
