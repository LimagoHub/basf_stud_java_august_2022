package de.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends Item {
	
	
	



	public Ball(int xRichtung, int yRichtung, Rectangle rectangle) {
		super(xRichtung, yRichtung, rectangle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval((int) getX(), (int) getY(), (int)getWidth(), (int) getHeight());

	}

}
