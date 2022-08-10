package de.basf.collections;

public class Stapel {
	private static final int DEFAULT_SIZE =10;  
	private Object [] data;
	private int index;
	
	public Stapel() throws StapelException {
		this(DEFAULT_SIZE);
	}
	
	public Stapel(int size) throws StapelException {
		if(size < 1)
			throw new StapelException("Init");
		data = new Object[size];
		index = 0;
	}
	
	
	public void push(Object value) throws StapelException{
		if(isFull()) throw new StapelException("Overflow");
		
		data[index++] = value;
	}
	
	public Object pop() throws StapelException {
		if(isEmpty())	throw new StapelException("Underflow");
		
		return data[--index];
	}
	
	public boolean isEmpty() {
		
		return index <= 0;
	}

	public boolean isFull() {
		
		return index >= data.length;
	}

}
