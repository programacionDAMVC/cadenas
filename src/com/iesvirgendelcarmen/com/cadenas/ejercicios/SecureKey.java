package com.iesvirgendelcarmen.com.cadenas.ejercicios;

public class SecureKey {
	
	private String key;

	public SecureKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	
	
	
	@Override
	public String toString() {
		return "SecureKey [key=" + key +  "]\n";
	}

	public boolean isSecureKey1() {
		return hasEightChar() && hasUpperCaseLetter()
				&& hasLowerCaseLetter() && hasDigit()
				&& hasNoDigitOrLetter();
	}
	//método a revisar
	public boolean isSecureKey2() {
		String regex = "^(?=.*[A-Z].*)(?=.*[\\W_].*)"
				+ "(?=.*[0-9].*)(?=.*[a-z].*)(?=.{8,})$";
		return key.matches(regex);
	}
	
	
	private boolean hasEightChar() {
		return key.length() >= 8;
		//return key.matches(".{8,}");
	}
	
	private boolean hasUpperCaseLetter() {
		boolean exit = false;
		for (int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if (Character.isUpperCase(c)) {
				exit = true;
				break;
			}
		}
		return exit || key.contains("Ñ");
		//return key.matches("^.*[A-ZÑ]+.*$");
	}
	
	private boolean hasLowerCaseLetter() {
		boolean exit = false;
		for (int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if (Character.isLowerCase(c)) {
				exit = true;
				break;
			}
		}
		return exit || key.contains("ñ");
		//return key.matches("^.*[a-zñ]+.*$");
	}
	
	private boolean hasDigit() {
		boolean exit = false;
		for (int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if (Character.isDigit(c)) {
				exit = true;
				break;
			}
		}
		return exit;
		//return key.matches("^.*[0-9]+.*$");
	}
	private boolean hasNoDigitOrLetter() {
		boolean exit = false;
		for (int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if ( !Character.isLetterOrDigit(c) ) {
				exit = true;
				break;
			}
		}
		return exit;
	//	return key.matches("^.*[\\W_]+.*$");
	}
	
/*	public static void main(String[] args) {
		System.out.println(Character.isLetterOrDigit('$'));
	}*/
	
}
