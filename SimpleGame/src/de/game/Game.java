package de.game;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

import javax.swing.text.DefaultEditorKit.BeepAction;



public class Game extends Frame{


		private BufferStrategy strategy;
		private boolean gameover = false;
		
		private Ball ball;
		private Paddle paddle;
		
		public Game() {
			
			ball = new Ball(2,3,new Rectangle(400,400,20,20));
			paddle = new Paddle(0, 0, new Rectangle(20,100 ,200,20));
			
			setSize(800, 800);
			setVisible(true);
			this.createBufferStrategy(2);
			strategy = this.getBufferStrategy();
		}
		
		public static void main(String[] args) {
			new Game().run();

		}
		
		public void run() {
			while(! gameover) {
				calculateScene();
				renderScene();
				
			}
		}

		private void calculateScene() {
			int x = (int) ball.getX();
			x += ball.getxRichtung();
			ball.getRectangle().x = x;
			
			int y = (int) ball.getY();
			y += ball.getyRichtung();
			ball.getRectangle().y = y;
			
			if(ball.getX() < 0 || ball.getX() > getWidth()) {
				ball.setxRichtung(ball.getxRichtung() * -1);
			}
			
			if(ball.getY() < 0 || ball.getY() > getHeight()) {
				ball.setyRichtung(ball.getyRichtung() * -1);
			}
			
			if(ball.getRectangle().intersects(paddle.getRectangle())) {
				System.out.println("Treffer");
			}
			
		}

		private void renderScene() {
			Graphics g = strategy.getDrawGraphics();
			
			ball.draw(g);
			paddle.draw(g);
			g.dispose();
			strategy.show();
			
		}




}
