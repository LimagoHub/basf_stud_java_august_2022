package de.basf.tiere;

public class Schwein {
	
	private String name;
	private int gewicht;
	private static int counter;
	
	
	
	
	public static int getCounter() {
		return counter;
	}
	// Klassen-konstruktor
	static {
		counter = 0;
	}
	
	// Instanz-Konstruktor
	public Schwein() {
		this("Nobody");
	}
	
	public Schwein(String name) {
		this.name = name;
		this.gewicht = 10;
		counter ++;
	}
	
	
	protected void finalize() throws Throwable {
		System.out.println("Quiiiiieeeek!");
		counter --;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void fressen() {
		gewicht ++;
	}
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}
	
	

}
