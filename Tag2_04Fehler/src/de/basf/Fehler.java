package de.basf;

public class Fehler {

	public static void main(String[] args)  {
		
		
		
	try {
		int a,b,c;
		int feld [] = new int[2];
		a = b = 0;
		
		feld[1000] = 5;
		c = a / b;
		
		
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	
		
		System.out.println("Sie haben ein kleines Programm echt glücklich gemacht");
	}
	
	
}
