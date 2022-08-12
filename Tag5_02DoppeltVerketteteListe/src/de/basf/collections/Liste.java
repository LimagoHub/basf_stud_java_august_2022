package de.basf.collections;

public interface Liste<T> {
	
	void append(T value);
	T get();
	boolean update(T newValue);
	boolean remove();
	boolean moveFirst();
	boolean moveLast();
	boolean movePrevious();
	boolean moveNext();
	
	boolean isEmpty();
	
	/*
	 * liefert true wenn entweder die Liste leer ist oder wir AUF dem letzten Datensatz stehen
	 */
	boolean isEol();

	/*
	 * liefert true wenn entweder die Liste leer ist oder wir AUF dem ersten Datensatz stehen
	 */
	boolean isBol();

}
