package de.basf;

import java.util.Scanner;

public class Spiel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zufallszahl = 623;
		int versuch;
		
		do {
			System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 1000 ein: ");
			versuch = scanner.nextInt();
			if (versuch < zufallszahl)
				System.out.println("Versuch zu klein !");
			if (versuch > zufallszahl)
				System.out.println("Versuch zu gross !");
		} while (versuch != zufallszahl);
		System.out.println("Du hast die Zahl eraten !");	
		
		
	}
}
