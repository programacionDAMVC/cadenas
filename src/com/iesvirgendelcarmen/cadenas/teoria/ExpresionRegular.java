package com.iesvirgendelcarmen.cadenas.teoria;

import java.util.Scanner;

public class ExpresionRegular {

	public static void main(String[] args) {
		// leer un DNI 12345678letra
		
		String dniRegex = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]?$";
		String movilRegex = "^(\\+?34)?[67][\\d]{8}$";
		String decimalRegex ="";
		//esValido(leerToken(), dniRegex);
		//esValido(leerToken(), movilRegex);
		
	
	}
	
	public static void esValido(String token, String regex) {
		boolean exito = token.trim().toUpperCase().matches(regex);
		System.out.printf("TOKEN %s ¿es válido? %B%n", token, exito);
	}
	
	public static String leerToken() {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce token");
		String token = in.next();
		in.close();
		return token;
	}
	
	
}
