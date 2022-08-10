package de.basf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Bitte geben Sie den ersten Faktor ein: ");
		int faktor1 = scanner.nextInt();
		System.out.println("Bitte geben Sie den zweiten Faktor ein: ");
		int faktor2 = scanner.nextInt();
		
		if (faktor1 < faktor2) {
			int leeresGlas = faktor1;
			faktor1 = faktor2;
			faktor2 = leeresGlas;
		}
		
		long produkt = faktor1; 
		
		for (int i = 1; i < faktor2; i++) {
			produkt += faktor1;
			System.out.println(i);
		}
		System.out.println(produkt);
	}

}
