package com.iesvirgendelcarmen.com.cadenas.ejercicios;
 
import java.util.ArrayList;
import java.util.List;

public class TestSecureKey {

	public static void main(String[] args) {
		List<SecureKey> validList = new ArrayList<>();
		List<SecureKey> noValidList = new ArrayList<>();
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm-MnNñÑoOpPq"
				+ "QrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
		
		//Generate  1000 keys
		for (int i = 0; i < 1_000_000; i ++) {
			
			int sizeKey = (int) (Math.random() *
					FUENTE_CARACTERES.length());
			//System.out.println(sizeKey); 
			StringBuilder sBKey = new StringBuilder(); // empty key
			SecureKey sKey = null;
			for (int j = 0; j < sizeKey; j++) {
				int position = (int) (Math.random() *
						FUENTE_CARACTERES.length());
				sBKey.append(FUENTE_CARACTERES.charAt(position));
		
			}
			sKey = new SecureKey(sBKey.toString());
			if (sKey.isSecureKey1())
				validList.add(sKey);
			else
				noValidList.add(sKey);
			
		}
		System.out.println(noValidList);
		System.out.println(validList.size() + " - " + noValidList.size());
	}

}
