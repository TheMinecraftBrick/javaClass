package javaClass;

import java.awt.Color;
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

	int y, x, b;
	Random rand = new Random();
	int rx = rand.nextInt(780) + 1;
	Random rand1 = new Random();
	int ry = rand1.nextInt(780) + 1;

	// Double Buffer
	private Image dbImage;
	private Graphics dbg;

	// Window Basics
	public KeyMouse() {
		addKeyListener(new Key());
		setTitle("Snake");
		setSize(800, 700);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 150;
		y = 150;
		b = 0;
		

	}

	public static void main(String[] args) {
		new KeyMouse();
		

	}

	// Controls
	public class Key extends KeyAdapter {

		public void keyPressed(KeyEvent event) {

			int keyCode = event.getKeyCode();
			if (keyCode == KeyEvent.VK_LEFT) {
				b = 1;

			}
			if (keyCode == KeyEvent.VK_RIGHT) {
				b = 0;
			}
			if (keyCode == KeyEvent.VK_UP) {
				b = 2;
			}
			if (keyCode == KeyEvent.VK_DOWN) {
				b = 3;
			}

		}

	}

	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponenet(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}

	public void paintComponenet(Graphics g) {
	

		if (b == 1) {
			
			x -= 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			g.fillOval(rx, ry, 15, 15);
			if (x < 0 || y < 25 || x > 780 || y > 680 || x == rx && y == ry){
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(1000000000);
				
			}

		} else if (b == 0) {
			System.out.println("y" + y);
			System.out.println("x" + x);
			x += 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			g.fillOval(rx, ry, 15, 15);

			if (x < 0 || y < 25 || x > 780 || y > 680 || x == rx && y == ry){
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(1000000000);
				
			}
		}else if (b == 2){
			System.out.println("y" + y);
			System.out.println("x" + x);
			y -= 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			g.fillOval(rx, ry, 15, 15);

			if (x < 0 || y < 25 || x > 780 || y > 680 || x == rx && y == ry){
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(1000000000);
				

			}
		}else if(b == 3){
			System.out.println("y" + y);
			System.out.println("x" + x);
			y += 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			g.fillOval(rx, ry, 15, 15);

			if (x < 0 || y < 25 || x > 780 || y > 680 || x == rx && y == ry){
				repaint();
				g.drawString("Game Over", 400, 350);
				repaint();
				KeyMouse.delay(1000000000);
				
			}
		} 
			

		KeyMouse.delay(10);

	}


}