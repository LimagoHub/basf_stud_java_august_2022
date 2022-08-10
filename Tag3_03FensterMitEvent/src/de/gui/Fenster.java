package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Fenster extends Frame implements KeyListener, MouseMotionListener{
	
	private static final int SIZE = 500;
	private String message = "Hallo Fenster";
	private int x,y;
	
	
	public Fenster() {
		x = y = SIZE/2;
		addKeyListener(this);
		addMouseMotionListener(this);
		
		setSize(SIZE, SIZE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(x, y, 20, 20);
		g.drawString(message, 50, 100);
		
	}

	public static void main(String[] args) {
		new Fenster();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_ESCAPE: dispose();	break;
		case KeyEvent.VK_RIGHT: x++;	break;
		case KeyEvent.VK_LEFT: x--;	break;
		case KeyEvent.VK_DOWN: y++;	break;
		case KeyEvent.VK_UP: y--;	break;

		
		}
		
		
		message = "Taste wurde gedrückt!";
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x += (e.getX() - x) / 20;
		y += (e.getY() - y) / 20;
		repaint();
	}

}
