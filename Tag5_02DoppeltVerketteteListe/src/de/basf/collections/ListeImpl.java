package de.basf.collections;

public class ListeImpl<T> implements Liste<T> {
	
	
	private Kettenglied<T> start;
	private Kettenglied<T> akt;
	
	public ListeImpl() {
		start = akt = null;
	}
	

	@Override
	public void append(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(T newValue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveFirst() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveLast() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean movePrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEol() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBol() {
		// TODO Auto-generated method stub
		return false;
	}

	class Kettenglied<T> {
		Kettenglied vor;
		Kettenglied nach;
		T data;
		public Kettenglied(T data) {
			this.data = data;
			vor = nach = null;
		}
		
	}
}
