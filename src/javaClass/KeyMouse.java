package javaClass;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;

public class KeyMouse extends JFrame {



	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Variables

	int y, x, b, score, story;
	double s;
	Random rand = new Random();
	int rx = rand.nextInt(920) + 30;
	Random rand1 = new Random();
	int ry = rand1.nextInt(620) + 30;

	Random rand2 = new Random();
	int by = rand2.nextInt(620) + 30;
	Random rand3 = new Random();
	int bx = rand3.nextInt(920) + 30;
	
	// Double Buffer
	private Image dbImage;
	private Graphics dbg;

	// Window stuff
	public KeyMouse() {
		addKeyListener(new Key());
		setTitle("Border Patrol");
		setSize(1000, 700);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 150;
		y = 150;
		b = 10;
		s = 1;
		story = 0;

	}

	public static void main(String[] args) {
		new KeyMouse();
		//main to run it
	}

	// Controls
	public class Key extends KeyAdapter {

		public void keyPressed(KeyEvent event) {

			int keyCode = event.getKeyCode();
			
			
			if (keyCode == KeyEvent.VK_LEFT) {
				b = 1;
				story = 1;
			}
			if (keyCode == KeyEvent.VK_RIGHT) {
				b = 0;
				story = 1;

			}
			if (keyCode == KeyEvent.VK_UP) {
				b = 2;
				story = 1;

			}
			if (keyCode == KeyEvent.VK_DOWN) {
				b = 3;
				story = 1;

			}

		}

	}
	
	@Override
	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Open Sans", Font.BOLD, 22));
		g.drawString("Score: " + score, 50, 50);
		//create screen
		repaint();
		g.setColor(Color.BLUE); //player
		g.fillOval(x, y, 20, 20);
		g.setColor(Color.ORANGE); //objective
		g.fillOval(rx, ry, 15, 15);
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 800);
		g.setColor(Color.GREEN);
		//draw background 
		g.setColor(Color.GRAY);
		g.fillRect(375, 500, 300, 150);
		g.setFont(new Font("Courier New", Font.BOLD, 12));
		g.setColor(Color.BLUE);
		g.drawString("You are a A border patrol agent,(Blue Dot)", 380, 530);
		g.drawString("Attempting to collect up all the criminals", 380, 550);
		g.drawString("(Yellow Dots). Don't touch the borders!", 380, 570);
		g.drawString("Use the Arrow keys to Move!", 380, 590);
		g.setColor(Color.YELLOW);
		g.drawString("Press any <Arrow Key> to continue", 400, 620);
	
		if(story == 1){
			
			g.setColor(Color.BLACK);
			g.fillRect(375, 500, 300, 150);
			repaint();
			
		}
		
//check for movement and scoring 
		
		if (b == 1) {
			
			x -= s;
			repaint();
			g.setColor(Color.BLUE); //player
			g.fillOval(x, y, 20, 20);
			g.setColor(Color.ORANGE); //objective
			g.fillOval(rx, ry, 15, 15);
			
			if((x >= rx - 15 && x <= rx+15) && (y >= ry - 15 && y <= ry + 15)) { //check if collected
			
				score += 1; //score modifier
				s+=0.5; //speed modifier
				System.out.println("Score: " + score);
				System.out.println("Speed: " + s); 
				g.setColor(Color.BLACK); // object creators
				g.fillOval(rx, ry, 15, 15);
				rx = rand.nextInt(920) + 30;
				ry = rand1.nextInt(620) + 30;
				g.setColor(Color.BLUE);
			}
			if (x < 0 || y < 25 || x > 980 || y > 680){ //border patrol. 
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(5000);	
				System.exit(0);
			}
			
			

		} else if (b == 0) {
			//System.out.println("y" + y);
			//System.out.println("x" + x);
			x += s;
			repaint();
			g.setColor(Color.BLUE);
			g.fillOval(x, y, 20, 20);
			g.setColor(Color.ORANGE);
			g.fillOval(rx, ry, 15, 15);
			if((x >= rx - 15 && x <= rx+15) && (y >= ry - 15 && y <= ry + 15)) {
			
				score += 1;
				s += 0.5;
				System.out.println("Score: " + score);
				System.out.println("Speed: " + s);
				g.setColor(Color.BLACK);
				g.fillOval(rx, ry, 15, 15);
				rx = rand.nextInt(920) + 30;
				ry = rand1.nextInt(620) + 30;
				g.setColor(Color.BLUE);
			}
			if (x < 0 || y < 25 || x > 980 || y > 680) {
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(5000);	
				System.exit(0);
				
				
				
			}
		}else if (b == 2){
			//System.out.println("y" + y);
			//System.out.println("x" + x);
			y -= s;
			repaint();
			g.setColor(Color.BLUE);
			g.fillOval(x, y, 20, 20);
			g.setColor(Color.ORANGE);
			g.fillOval(rx, ry, 15, 15);
			if((x >= rx - 15 && x <= rx+15) && (y >= ry - 15 && y <= ry + 15)) {
				
				score += 1;
				s += 0.5;
				System.out.println("Score: " + score);
				System.out.println("Speed: " + s);
				g.setColor(Color.BLACK);
				g.fillOval(rx, ry, 15, 15);
				rx = rand.nextInt(920) + 30;
				ry = rand1.nextInt(620) + 30;
				g.setColor(Color.BLUE);
			}
			if (x < 0 || y < 25 || x > 980 || y > 680 ){
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(5000);	
				System.exit(0);
				
				
				

			}
		}else if(b == 3){
			//System.out.println("y" + y);
			//System.out.println("x" + x);
			y += s;
			repaint();
			g.setColor(Color.BLUE);
			g.fillOval(x, y, 20, 20);
			g.setColor(Color.ORANGE);
			g.fillOval(rx, ry, 15, 15);
			
			if((x >= rx - 15 && x <= rx+15) && (y >= ry - 15 && y <= ry + 15)) {
				
				score += 1;
				s += 0.5;
				System.out.println("Score: " + score);
				System.out.println("Speed: " + s);
				g.setColor(Color.BLACK);
				g.fillOval(rx, ry, 15, 15);
				rx = rand.nextInt(920) + 30;
				ry = rand1.nextInt(620) + 30;
				g.setColor(Color.BLUE);

			}
			
			if (x < 0 || y < 25 || x > 980 || y > 680 ){
				g.drawString("Game Over", 400, 350);
				KeyMouse.delay(5000);	
				System.exit(0);
				
				
			}
		} 
			

		KeyMouse.delay(10);

	}


}