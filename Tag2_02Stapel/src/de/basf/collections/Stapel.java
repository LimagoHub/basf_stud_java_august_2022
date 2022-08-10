package de.basf.collections;

public class Stapel {
	private static final int DEFAULT_SIZE =10;  
	private int [] data;
	private int index;
	
	public Stapel() {
		data = new int[10];
		index = 0;
	}
	
	public Stapel(int size) {
		
		data = new int[size < 1? DEFAULT_SIZE: size];
		index = 0;
	}
	
	
	public void push(int value) {
		if(isFull()) return;
		
		data[index++] = value;
	}
	
	public int pop() {
		if(isEmpty())	return 0;
		
		return data[--index];
	}
	
	public boolean isEmpty() {
		
		return index <= 0;
	}

	public boolean isFull() {
		
		return index >= data.length;
	}

}
