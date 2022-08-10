package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Linie extends Frame {

	private int x1,x2,y1,y2;
	public Linie() {
		
		x1 = x2 = y1 = y2 = -1;
		addMouseListener(new MyMouseListener());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}
	
	public static void main(String[] args) {
		new Linie();

	}

	class MyMouseListener extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			x1 = e.getX();
			y1 = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			x2 = e.getX();
			y2 = e.getY();
			Linie.this.repaint();
		}
		
	}
	
//	class MyWindowListener extends WindowAdapter {
//
//		@Override
//		public void windowClosing(WindowEvent e) {
//			dispose();
//		}
//		
//	}
}
