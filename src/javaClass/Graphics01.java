package javaClass;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Graphics01 extends Applet {

	public void paint(Graphics g) {
		/*
		  g.setColor(Color.RED); g.drawLine(0, 0, 800, 600); g.drawRect(100, 100, 100,
		  200); g.drawLine(0, 600, 800, 0); g.drawLine(100, 300, 700, 300);
		  g.drawLine(400, 100, 400, 500); g.drawRect(600, 100, 100, 200);
		  g.drawOval(300, 100, 60, 100); g.fillOval(300, 100, 60, 100);
		 

		
		  for (int k = 100; k < 400; k++) {
		  
		  
		  try { g.drawString("hi", 100, 200); System.out.println("hi");
		 Thread.sleep(1000); System.out.println("hi again"); g.drawLine(1, 15, k,
		  1414);
		  
		  } catch (InterruptedException e) {
		 
		 e.printStackTrace(); }
		 
		g.drawOval(100, 100, 40, 40);// head
		g.drawLine(120, 140, 120, 200); // body
		g.drawLine(120, 200, 140, 230); // right leg
		g.drawLine(120, 200, 100, 230); // left leg
		g.drawLine(120, 160, 150, 190); // right arm
		g.drawLine(120, 160, 100, 190); // left arm
		
		for (int a = 100; a > 20; a--) {

			g.setColor(Color.BLACK);
			g.drawLine(120, 160, a, 190); // left arm
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(Color.WHITE);
			g.drawLine(120, 160, a + 1, 190);

		}

		for (int b = 100; b > 20; b--) {

			g.setColor(Color.BLACK);
			g.drawLine(120, 160, b, b); // left arm
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(Color.WHITE);
			g.drawLine(120, 160, b + 1, b);

		} 

		
		  for (int k = 100; k < 400; k++) {
		  
		  try {
		  
		 Thread.sleep(100);
		  
		 } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		 
		  g.drawLine(0, 0, 100, 100); g.drawLine(0, 0, k, 100);
		 
		  
		 }
		 
		while(true) {
			int x = 250;
		g.drawRect(100, 100, 200, 300);
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.RED);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.ORANGE);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.YELLOW);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.GREEN);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.BLUE);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.MAGENTA);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		g.setColor(Color.PINK);
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.fillRect(100, 100, 200, 300);
		
		
		}
			int  color = rand.nextInt(11) + 1;
		if(color == 1) {
			g.setColor(Color.RED);
		} 
		else if (color == 2) {
			g.setColor(Color.ORANGE);
		}
		else if (color == 3) {
			g.setColor(Color.YELLOW);
		}
		else if (color == 4) {
			g.setColor(Color.GREEN);
		}
		else if (color == 5) {
			g.setColor(Color.BLUE);
		}
		else if (color == 6) {
			g.setColor(Color.CYAN);
		}
		else if (color == 7) {
			g.setColor(Color.MAGENTA);
		}
		else if (color == 8) {
			g.setColor(Color.PINK);
		}
		else if (color == 9) {
			g.setColor(Color.BLACK);
		}
		else if (color == 10) {
			g.setColor(Color.DARK_GRAY);
		}
		else if (color == 11) {
			g.setColor(Color.LIGHT_GRAY);
		}*/
		/*while(true) {
			
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random rand = new Random();
		int  n = rand.nextInt(500) + 1;
		int  c = rand.nextInt(500) + 1;
	
		int  x = rand.nextInt(255) + 1;
		int  y = rand.nextInt(255) + 1;
		int  z = rand.nextInt(255) + 1;
		Color colour = new Color(x,y,z);
		g.setColor(colour);
		g.drawOval(50, 50, 100, 100);
		g.fillOval(50, 50, 100, 100);
		g.drawString("hello World", 25, 25);
		}*/
		
	}

}
