package de.game;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Item {
	
	private int xRichtung;
	private int yRichtung;
	
	public void setBounds(int x, int y, int width, int height) {
		rectangle.setBounds(x, y, width, height);
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	private Rectangle rectangle= new Rectangle();
	public abstract void draw(Graphics g);
	
	public double getX() {
		return rectangle.getX();
	}
	public double getY() {
		return rectangle.getY();
	}
	public double getWidth() {
		return rectangle.getWidth();
	}
	public double getHeight() {
		return rectangle.getHeight();
	}
	public Rectangle intersection(Rectangle r) {
		return rectangle.intersection(r);
	}
	
	
	public int getxRichtung() {
		return xRichtung;
	}
	public void setxRichtung(int xRichtung) {
		this.xRichtung = xRichtung;
	}
	public int getyRichtung() {
		return yRichtung;
	}
	public void setyRichtung(int yRichtung) {
		this.yRichtung = yRichtung;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public Item(int xRichtung, int yRichtung, Rectangle rectangle) {
		super();
		this.xRichtung = xRichtung;
		this.yRichtung = yRichtung;
		this.rectangle = rectangle;
	}
	
	
	
	
	

}
