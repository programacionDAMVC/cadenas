package com.iesvirgendelcarmen.cadenas.teoria;

import java.util.Scanner;

public class AuxiliarTarjetaCredito {

	public static void main(String[] args) {
		//leer con scanner el nº tarjeta
		System.out.println("Introduce el nº de tarjeta");
		Scanner in = new Scanner(System.in);
		String numeroTarjeta = in.nextLine();
		in.close();
		//epresion regular para comprobar el formato del nº
		//se admite espacio en blanco al principio y al final
		//se admite xxxx xxxx xxxx xxxx también con mas espacios entre 
		//cada grupo de cuatro números
		//se admite xxxx-xxxx-xxxx-xxxx
		//se adminte 1234123412341234 
		String regexNumeroTarjeta = "\\s*\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)"
				+ "\\d{4}(\\s*|-?)\\d{4}\\s*";
		System.out.printf("Comprobando numero %s: %b%n",
				numeroTarjeta, numeroTarjeta.matches(regexNumeroTarjeta));
		String numeroTarjetaFinal = numeroTarjeta.trim().
				replaceAll("[-\\s]", "");
		System.out.println(numeroTarjetaFinal);
		
		//cada caracter su valor en decimal vale caracter + 48
		/*char cero = '3'; //48
		char uno  = '9' ; //49
		int suma = cero -48 + uno -48 ;  
		System.out.println(suma);*/
		int suma = 0;
		for (int i = 0; i < numeroTarjetaFinal.length() - 1; i++) {
			int numero = numeroTarjetaFinal.charAt(i) - 48;
			if ( i % 2 != 0) {
				numero *= 2;
			}
			suma += numero;
		}
		int multiplicacion = suma * 9;
		String multiplacionCadena = multiplicacion + "";
		// 904 length = 3; 0 -> 9, 1 -> 0, 2 -> 4
		String ultimoNumero = multiplacionCadena.
				substring(multiplacionCadena.length() -1);
		System.out.printf("Suma: %d, multiplicacion %d, ultima cifra %s%n",
				suma, multiplicacion, ultimoNumero);
		System.out.printf("Tarjeta %s ¿válida? %b%n", numeroTarjetaFinal,
				numeroTarjetaFinal.substring(numeroTarjetaFinal.length() -1)
				.equals(ultimoNumero));
	}
}
