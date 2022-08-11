package de.basf.gui;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintClone extends Frame {

	private static final int SIZE = 800;
	
	public PaintClone() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(SIZE, SIZE);
		setResizable(false);
		setMenuBar(new MyMenubar());
	}
	
	public static void main(String[] args) {
		new PaintClone().setVisible(true);
	}

}
