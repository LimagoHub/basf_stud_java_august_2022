package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenster extends Frame implements KeyListener{
	
	private String message = "Hallo Fenster";
	
	
	
	public Fenster() {
		
		addKeyListener(this);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		
		g.drawString(message, 50, 100);
		
	}

	public static void main(String[] args) {
		new Fenster();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		message = "Taste wurde gedrückt!";
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
