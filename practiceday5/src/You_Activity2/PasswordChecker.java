package You_Activity2;

public class PasswordChecker {
	// Method to check if a character is a capital letter
	static boolean isCapitalLetter(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// Method to check if a character is a small letter
	static boolean isSmallLetter(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

	// Method to check if a character is a digit
	static boolean isDigit(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	// Method to check if a string has at least one capital letter
	static boolean hasCapitalLetter(String password) {
		for (char ch : password.toCharArray()) {
			if (isCapitalLetter(ch)) {
				return true;
			}
		}
		return false;
	}

	// Method to check if a string has at least one small letter
	static boolean hasSmallLetter(String password) {
		for (char ch : password.toCharArray()) {
			if (isSmallLetter(ch)) {
				return true;
			}
		}
		return false;
	}

	// Method to check if a string has at least one digit
	static boolean hasDigit(String password) {
		for (char ch : password.toCharArray()) {
			if (isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	// Method to check if a string has at least one special symbol
	static boolean hasSplSymbol(String password) {
		for (char ch : password.toCharArray()) {
			if (!isCapitalLetter(ch) && !isSmallLetter(ch) && !isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	// Method to validate the password according to Mr. Shyam's requirements
	static boolean isValidPassword(String username, String password) {
		// Check the length requirement
		if (password.length() < 8) {
			return false;
		}

		// Check if the password contains the username
		if (password.contains(username)) {
			return false;
		}

		// Check if the password meets the character type requirements
		return hasCapitalLetter(password) && hasSmallLetter(password) && hasDigit(password) && hasSplSymbol(password);
	}
}
