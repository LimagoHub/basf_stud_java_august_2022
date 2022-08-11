package de.basf.office;

import java.io.Serializable;

public class Word extends Wordpad implements Dokument {

	@Override
	public void drucken() {
		System.out.println("Hier druckt Word!");
	}

}
