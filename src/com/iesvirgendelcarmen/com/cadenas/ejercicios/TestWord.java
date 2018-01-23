package com.iesvirgendelcarmen.com.cadenas.ejercicios;

import java.util.Scanner;

public class TestWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a word");
		Scanner sc = new Scanner(System.in);
		Word word = new Word(sc.next());
		sc.close();
		System.out.println(word.toString());

	}

}
