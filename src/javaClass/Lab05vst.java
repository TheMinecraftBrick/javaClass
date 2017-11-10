package javaClass;


// Lab05vst.java
//110 point version.
// Kush dalal on 10/25/17
// V1.2
//A bunch of optical illusions done with for statements to kill your brain :D

import java.awt.*;
import java.util.Random;
import java.applet.*;

public class Lab05vst extends Applet {
	public void paint(Graphics g) {
	
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		//create the square to draw in
		
		for (int k = 1; k < 25; k++) {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Random rand = new Random();
			int x = rand.nextInt(255) + 1;
			int y = rand.nextInt(255) + 1;
			int z = rand.nextInt(255) + 1;
			Color colour = new Color(x, y, z);
			//random color generator
			
			g.drawRect(10, 10, width, height);
			
			g.setColor(colour);//set the color
			
			// Illusion 1
			int h = 640; // define h as height
			for (int w = 30; w <= 990; w = w + 16) { // while w is less than 990 add 16 to it.
				h = h - 10; // inside of the previous loop, continue to subtract 10 from h
				g.drawLine(w, 640, 990, h); // draw the lines, width as x1 and height as y2
				
				//this repeats for the rest of the illusions

			}
			// Illusion 2
			
			int h1 = 640;
			for (int w = 965; w >= 25; w = w - 16) {
				h1 = h1 - 10;
				g.drawLine(w, 640, 10, h1);
			}
			// Illusion 3
			int h2 = 625;
			for (int w = 10; w <= 965; w = w + 16) {
				h2 = h2 - 10;
				g.drawLine(10, h2, w, 10);
			}
			// Illusion 4
			int h3 = 625;
			for (int w = 990; w >= 25; w = w - 16) {
				h3 = h3 - 10;
				g.drawLine(990, h3, w, 10);
			}

			// Inner box code after this line

			// Small Illusion 1
			g.drawRect(230, 175, 540, 300);
			int h4 = 475; // define h as height
			for (int w = 230; w <= 770; w = w + 10) {

				h4 = h4 - 5;
				g.drawLine(w, 475, 770, h4);
			}
			// Small Illusion 2
			int h5 = 475;
			for (int w = 770; w >= 230; w = w - 8) {
				h5 = h5 - 4;
				g.drawLine(w, 475, 230, h5);

			}
			// Small Illusion 3
			int h6 = 430;
			for (int w = 230; w <= 735; w = w + 8) {
				h6 = h6 - 4;
				g.drawLine(230, h6, w, 175);
			}
			// Small Illusion 4
			int h7 = 430;
			for (int w = 770; w >= 260; w = w - 8) {
				h7 = h7 - 4;
				g.drawLine(770, h7, w, 175);

			}

		}
	}
	
}
