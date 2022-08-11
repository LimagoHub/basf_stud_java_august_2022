package de.games;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class BouncingBall extends Frame{

	private BufferStrategy strategy;
	private boolean gameover = false;
	
	private int x,y;
	private int xRichtung, yRichtung;
	
	public BouncingBall() {
		x =  y = 400;
		xRichtung = 2;
		yRichtung = 1;
		
		setSize(800, 800);
		setVisible(true);
		this.createBufferStrategy(2);
		strategy = this.getBufferStrategy();
	}
	
	public static void main(String[] args) {
		new BouncingBall().run();

	}
	
	public void run() {
		while(! gameover) {
			calculateScene();
			renderScene();
			
		}
	}

	private void calculateScene() {
		x += xRichtung;
		y += yRichtung;
		
		if( x < 0 || x > getWidth())
			xRichtung *= -1;
		
		if( y < 0 || y > getHeight())
			yRichtung *= -1;
		
	}

	private void renderScene() {
		Graphics g = strategy.getDrawGraphics();
		g.setColor(Color.RED);
		//g.clearRect(0, 0, getWidth(), getHeight());
		g.setXORMode(Color.BLUE);
		g.fillOval(x-10, y-10, 20, 20);
		g.dispose();
		strategy.show();
		
	}

}
