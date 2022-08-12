package de.basf.collections;

public class ListeImpl<T> implements Liste<T> {
	
	
	private Kettenglied<T> start;
	private Kettenglied<T> akt;
	
	public ListeImpl() {
		start = akt = null;
	}
	

	@Override
	public void append(T value) {
		Kettenglied<T> neu = new Kettenglied<>(value);
		if(isEmpty()) {
			start = neu;
			
		} else {
			moveLast();
			neu.vor = akt;
			akt.nach = neu;
			
		}
		akt = neu;
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
		
		return start == null;
	}

	@Override
	public boolean isEol() {
		
		return isEmpty() || akt.nach == null;
	}

	@Override
	public boolean isBol() {
		
		return isEmpty() || akt.vor == null;
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
