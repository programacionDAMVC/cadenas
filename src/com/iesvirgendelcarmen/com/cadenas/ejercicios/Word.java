package com.iesvirgendelcarmen.com.cadenas.ejercicios;
/**
 * Class Word
 * @author programacion
 * @version 1.0
 */
public class Word {
	
	private String value;
	
	/**
	 * 
	 * @param value type String, content of word
	 */
	public Word(String value) {
		this.value = value;
	}
	/**
	 * 
	 * @return int number of character of word
	 */
	public int getNumberOfChar() {
		return value.length();
	}
	
	/**
	 * 
	 * @return boolean, true if word starts with a vowel
	 */
	public boolean startWithVowel() {
		return value.toLowerCase().matches("^[aeiouáéíóú].*$");
	}
	/**
	 * 
	 * @return boolean, true if word ends with a vowel
	 */
	public boolean endWithVowel() {
		return value.toLowerCase().matches("^.*[aeiouáéíóú]$");
	}
	
	/**
	 * 
	 * @return int, number of total vowel
	 */
	public int countNumberoOfVowel() {
		int sum = 0;
		for (int i = 0; i < getNumberOfChar(); i++) {
			/*String string = value.toLowerCase().charAt(i) + "";
			if (string.matches("^[aeiouáéíóú].*$"))
				sum++;*/
			Word word = new Word(value.toLowerCase().charAt(i) + "");
			if (word.startWithVowel())
				sum++;
		}
		return sum;
	}
	
	/**
	 * 
	 * @return boolean if word contains character h or H
	 */
	public boolean containshorH() {
		return value.toLowerCase().contains("h"); 
	}
	
	/**
	 * 
	 * @param string word to compare
	 * @return boolean, true if string and value is equal
	 */
	public boolean isEqualInValue(String string) {
		return value.equalsIgnoreCase(string);
	}
	
	/**
	 * 
	 * @return boolean, true if value is a palindrome
	 */
	public boolean isPalindrome() {
		StringBuilder sBuilder = new StringBuilder(value);
		String reverseWord = sBuilder.reverse().toString();
		return reverseWord.equals(value);
	}

	@Override
	public String toString() {
		return "Word [value=" + value + ", getNumberOfChar()=" + getNumberOfChar() + ", startWithVowel()="
				+ startWithVowel() + ", endWithVowel()=" + endWithVowel() + ", countNumberoOfVowel()="
				+ countNumberoOfVowel() + ", containsHorh()=" + containshorH() + ", isPalindrome()=" + isPalindrome()
				+ "]";
	}
	
	
	
	
}
