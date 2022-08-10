package de.basf.client;

import de.basf.tiere.Schwein;
import static de.basf.tiere.Schwein.getCounter;

public class Schweinetest {

	public static void main(String[] args) throws Exception{

		
		new Schweinetest().run();
	}

	private void run() {
		System.out.println(getCounter());
		
		// Deklaration
		Schwein piggy;
		
	
		
		piggy = new Schwein("Miss Piggy");
		
		System.out.println(getCounter());
		
		
		
		System.out.println(piggy.toString());
		
		piggy.fressen();
		
		System.out.println(piggy.toString());
		
		
	}

}
