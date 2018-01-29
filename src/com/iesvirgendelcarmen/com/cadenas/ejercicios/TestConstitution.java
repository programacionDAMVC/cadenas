package com.iesvirgendelcarmen.com.cadenas.ejercicios;

import java.util.Scanner;

public class TestConstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		while (in.hasNext()) {
			String  word = in.next();
			stringBuilder.append(word);
			stringBuilder.append(" ");
		}
		in.close();
		System.out.println(stringBuilder);
		System.out.println(UtilitiesString.countDeterminateArticle(stringBuilder.toString()));
		System.out.println(UtilitiesString.countUndeterminateArticle(stringBuilder.toString()));
		System.out.println(UtilitiesString.countWords(stringBuilder.toString()));
		System.out.println(UtilitiesString.countPreposition(stringBuilder.toString()));
		System.out.println(UtilitiesString.returnToUpperCase(56, 8000, stringBuilder.toString()));

	}

}
