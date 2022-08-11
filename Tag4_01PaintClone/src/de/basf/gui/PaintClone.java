package de.basf.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintClone extends Frame {

	
	public enum Formen {LINIE, OVAL,RECHTECK,LOESCHEN};
	
	private static final int SIZE = 800;
	private Color color = Color.WHITE;
	private Formen form = Formen.LINIE;
	
	
	
	public Formen getForm() {
		return form;
	}

	public void setForm(Formen form) {
		this.form = form;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public PaintClone() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(SIZE, SIZE);
		setResizable(false);
		setMenuBar(new MyMenubar(this));
	}
	
	public static void main(String[] args) {
		new PaintClone().setVisible(true);
	}

}
