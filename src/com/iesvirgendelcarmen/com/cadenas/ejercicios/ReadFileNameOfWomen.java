package com.iesvirgendelcarmen.com.cadenas.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileNameOfWomen {

	public static void main(String[] args) {
		
		List<String> womenList = new ArrayList<>();
		List<String> womenListStartWithA = new ArrayList<>();
		List<String> womenListNoEndWithVowel = new ArrayList<>();
		List<String> womenListWithLongestName = new ArrayList<>();
		List<String> womenListWithShortestName = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String nameOfWoman;
		int longestName  = 0;
		int shortestName = Integer.MAX_VALUE; 
		while ( sc.hasNextLine() ) {
			
			nameOfWoman = sc.nextLine();
			womenList.add(nameOfWoman);
			
			if (nameOfWoman.startsWith("a"))
				womenListStartWithA.add(nameOfWoman);
			
			if (nameOfWoman.matches("^.*[^aeiou]$"))
				womenListNoEndWithVowel.add(nameOfWoman);
			
			if (nameOfWoman.length() >= longestName) {
				
				if (nameOfWoman.length() > longestName) {
					longestName = nameOfWoman.length();
					womenListWithLongestName.clear();
				}
				
				womenListWithLongestName.add(nameOfWoman);
			}
			
			if (nameOfWoman.length() <= shortestName) {
				
				if (nameOfWoman.length() < shortestName) {
					shortestName = nameOfWoman.length();
					womenListWithShortestName.clear();
				}
				
				womenListWithShortestName.add(nameOfWoman);
				
			}
		}
		
		sc.close();
		
		if (args.length != 0)
			System.out.printf("%s exist? %b%n", args[0], 
					womenList.contains(args[0]));
		
		else {
			
			System.out.println("Nº of names of women: " + womenList.size());
			System.out.println("Nº of names which start with a: " + womenListStartWithA.size());
			System.out.println(womenListStartWithA);
			System.out.println(womenListNoEndWithVowel);
			System.out.println(womenListWithLongestName);
			System.out.println(womenListWithShortestName);

		}


		

	}

}
