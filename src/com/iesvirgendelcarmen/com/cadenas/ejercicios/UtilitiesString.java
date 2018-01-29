package com.iesvirgendelcarmen.com.cadenas.ejercicios;

import java.util.Arrays;
import java.util.List;

public class UtilitiesString {
	
	public static final String[] ARTICULOS_DETERMINADOS =
		{"el", "lo", "la", "las", "los"};
	public static final String[] ARTICULOS_INDETERMINADOS = 
		{"un", "una", "unos", "unas"};
	public static final String[] PREPOSICIONES = 
		{"a" , "ante", "bajo", "cabe", "con", "contra", "de",
		 "desde", "en", "entre", "hacia", "hasta", "para", "por",
		 "según", "sin", "so", "sobre", "tras", "durante",
		 "mediante", "excepto"};
	
	private static String clearPunctuationMarksAndLowerCase(String phrase) {
		return phrase.trim().replaceAll("[\",;:\\.¿\\?¡!\\(\\)><\\-=']", "").
				toLowerCase();
	}
	
	public static int countWords(String phrase) {
		return clearPunctuationMarksAndLowerCase(phrase)
				.split("\\s+").length;
	}
	
	public static int countPreposition(String phrase) {
		//get format phrase
		String newPhrase = clearPunctuationMarksAndLowerCase(phrase);
		//get an array of words from the phrase
		String[] words = newPhrase.split("\\s+");
		//change the array of prepositions in an List
		//to use contains method of List
		List<String> listPreposition = Arrays.asList(PREPOSICIONES);
		int sum = 0; //counter
		//iterate the array
		for (String string : words) {
			if (listPreposition.contains(string))
				sum++;
		}
		return sum;
	}
	
	public static int countDeterminateArticle(String phrase) {
		String newPhrase = clearPunctuationMarksAndLowerCase(phrase);
		String[] words = newPhrase.split("\\s+");
		List<String> listDeterminateArticles =
				Arrays.asList(ARTICULOS_DETERMINADOS);
		int sum = 0; //counter
		//iterate the array
		for (String string : words) {
			if (listDeterminateArticles.contains(string))
				sum++;
		}
		return sum;
	}
	
	public static int countUndeterminateArticle(String phrase) {
		String newPhrase = clearPunctuationMarksAndLowerCase(phrase);
		String[] words = newPhrase.split("\\s+");
		List<String> listUndeterminateArticles =
				Arrays.asList(ARTICULOS_INDETERMINADOS);
		int sum = 0; //counter
		//iterate the array
		for (String string : words) {
			if (listUndeterminateArticles.contains(string))
				sum++;
		}
		return sum;
	}
	
	public static String returnToUpperCase(int begin, int end, String phrase) {
		if (begin >= end || begin > phrase.length() 
				|| end > phrase.length())
			return phrase;
		else {
			String firstString  = phrase.trim().substring(0, begin);
			String middleString = phrase.trim().substring(begin, end);
			String finalString  = phrase.trim().substring(end);
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(firstString);
			sBuilder.append(middleString.toUpperCase());
			sBuilder.append(finalString);
			return sBuilder.toString();
 		}
			
		
	}
	
	public static void main(String[] args) {
		String phrase = " Hola esto es una a ante CABE frase ";
		System.out.println(returnToUpperCase(2, 2, phrase));
	}
}
