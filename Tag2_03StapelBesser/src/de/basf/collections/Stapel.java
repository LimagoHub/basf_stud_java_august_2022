package de.basf.collections;

public class Stapel {
	private static final int DEFAULT_SIZE =10;  
	private Object [] data;
	private int index;
	
	public Stapel() {
		data = new Object[10];
		index = 0;
	}
	
	public Stapel(int size) {
		
		data = new Object[size < 1? DEFAULT_SIZE: size];
		index = 0;
	}
	
	
	public void push(Object value) throws StapelException{
		if(isFull()) throw new StapelException("Overflow");
		
		data[index++] = value;
	}
	
	public Object pop() {
		if(isEmpty())	return null;
		
		return data[--index];
	}
	
	public boolean isEmpty() {
		
		return index <= 0;
	}

	public boolean isFull() {
		
		return index >= data.length;
	}

}
