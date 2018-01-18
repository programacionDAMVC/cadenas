package com.iesvirgendelcarmen.cadenas.teoria;

import java.util.Scanner;

public class ManipularDouble {

	public static void main(String[] args) {
		// leer scanner (con next)
		System.out.println("Introduce token");
		Scanner sc = new Scanner(System.in);
		//double numero = sc.nextDouble();
		String token = sc.next();
		sc.close();
		System.out.println("Token recibido: " + token);
		// aplicar la expresión regular
		String regex = "^-?[\\d]+([,.][\\d]+)?$";
		boolean valido = token.matches(regex);
		System.out.printf("Válido el token %s, %b%n", 
				token, valido);
		
		if ( valido ) {
			// reemplazar las , por . en el nº decimal
			String numeroCadena = token.replace(',','.');
			// convertir el String a double
			double numero = Double.parseDouble(numeroCadena);
			// mostrar la raiz cúbica con tres decimales
			System.out.printf("Raiz cubica de %s vale %.3f%n",
					token, Math.cbrt(numero));
		}
		

	}

}
