package de.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;



public class Game extends Frame{


		private BufferStrategy strategy;
		private boolean gameover = false;
		
		private Ball ball;
		private Paddle paddle;
		
		public Game() {
			setSize(800, 800);
			ball = new Ball(-2,3,new Rectangle(600,400,20,20));
			paddle = new Paddle(0, 0, new Rectangle(200,getHeight() - 50 ,200,20));
			
			addKeyListener(new MyKeyListener());
			
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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		private void calculateScene() {
			
			ball.getRectangle().x += ball.getxRichtung();
			
			ball.getRectangle().y += ball.getyRichtung();
			
			
			
			if(ball.getX() < 0 || ball.getX() > getWidth()) {
				ball.setxRichtung(ball.getxRichtung() * -1);
			}
			
			if(ball.getY() < 0 ) {
				ball.setyRichtung(ball.getyRichtung() * -1);
			}
			
			if(ball.getY() > getHeight() ) {
				gameover = true;
				
			}
			
			
			if(ball.getRectangle().intersects(paddle.getRectangle())) {
				ball.setyRichtung(ball.getyRichtung() * -1);
				//Toolkit.getDefaultToolkit().beep();
			}
			
		}

		private void renderScene() {
			Graphics g = strategy.getDrawGraphics();
			g.clearRect(0, 0, getWidth(), getHeight());
			if(gameover)
				g.drawString("Spielende", 200, 200);
			
			ball.draw(g);
			paddle.draw(g);
			g.dispose();
			strategy.show();
			
		}


		class MyKeyListener extends KeyAdapter {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT)
					paddle.getRectangle().x += 10;
				
				if(e.getKeyCode() == KeyEvent.VK_LEFT)
					paddle.getRectangle().x -= 10;
				
				
			}
			
		}

}
