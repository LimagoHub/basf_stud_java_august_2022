package de.basf.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class PaintClone extends Frame {

	
	public enum Formen {LINIE, OVAL,RECHTECK,LOESCHEN};
	private static final int SIZE = 800;
	private Color color = Color.WHITE;
	private Formen form = Formen.LINIE;
	
	private BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);
	
	
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
		addMouseListener(new MyMouseListener());
		setSize(SIZE, SIZE);
		setResizable(false);
		setMenuBar(new MyMenubar(this));
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0,0, SIZE,SIZE, this);
	}
	
	public static void main(String[] args) {
		new PaintClone().setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		private int x,y;

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Graphics g = image.getGraphics();
			g.setColor(getColor());
			switch(getForm()) {
			case LINIE: g.drawLine(x, y, e.getX(), e.getY()); break;
			case OVAL: g.drawOval(x, y, e.getX()-x, e.getY()-y); break;
			case RECHTECK: g.drawRect(x, y, e.getX()-x, e.getY()-y); break;
			case LOESCHEN: g.clearRect(x, y, e.getX()-x, e.getY()-y); break;
			}
			repaint();
		}
		
		
	}

}
