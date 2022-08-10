package de.basf.client;

import de.basf.collections.Stapel;

public class StapelTest {

	public static void main(String[] args) {
		Stapel myStapel = new Stapel();
		
		for (int i = 0; i < 10; i++) {
			if( ! myStapel.isFull()) {
				myStapel.push(i);
			}
				
			
		}
		
		while( ! myStapel.isEmpty()) {
			System.out.println(myStapel.pop());
		}

	}

}
