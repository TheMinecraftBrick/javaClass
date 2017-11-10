package javaClass;


// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Lab04bvst extends Applet {

	public void paint(Graphics g) {
		for (int k = 1; k < 25; k++) {
			try {
				Thread.sleep(125);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Random rand = new Random();
			int x = rand.nextInt(255) + 1;
			int y = rand.nextInt(255) + 1;
			int z = rand.nextInt(255) + 1;
			Color colour = new Color(x, y, z);
			// DRAW CUBE
			g.setColor(colour);
			g.drawRect(50, 50, 300, 300); // back face
			g.drawRect(150, 150, 300, 300); // front face
			g.drawLine(50, 50, 150, 150); // Connecting lines
			g.drawLine(350, 50, 450, 150);// Connecting lines
			g.drawLine(50, 350, 150, 450);// Connecting lines
			g.drawLine(350, 350, 450, 450);// Connecting lines

			
			
			// DRAW SPHERE

			g.drawOval(100, 100, 300, 300);
			g.drawOval(100, 135, 300, 225);
			g.drawOval(100, 175, 300, 150);
			g.drawOval(100, 215, 300, 65); // circle 1

			g.drawOval(135, 100, 225, 300);
			g.drawOval(175, 100, 150, 300);// Circle 2
			g.drawOval(215, 100, 65, 300);

			// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
			int x1 = 87; // precision editing
			g.drawOval(850, 500, 200, 200);// circle
			g.drawLine(850, 600, 1035, 550);
			g.drawLine(1035, 550, 925, 696);
			g.drawLine(850, 600, 925, 696); // Triangle
			g.drawOval(881, 581, x1, x1);// inside circle

			// DRAW APCS
			g.fillRect(50, 500, 100, 185);
			g.setColor(Color.WHITE);
			g.fillRect(80, 535, 40, 40);
			g.fillRect(80, 620, 40, 90);// Text Letter A
			g.setColor(colour);
			g.fillRect(200, 500, 100, 185);
			g.setColor(Color.WHITE);
			g.fillRect(230, 535, 40, 40);
			g.fillRect(230, 605, 70, 90);// Text Letter P
			g.setColor(colour);
			g.fillRect(340, 500, 100, 185);
			g.setColor(Color.WHITE);
			g.fillRect(380, 540, 70, 110);// Text letter C
			g.setColor(colour);
			g.fillRect(480, 500, 100, 185);
			g.setColor(Color.WHITE);
			g.fillRect(520, 535, 70, 40);
			g.fillRect(480, 610, 60, 40);// Text letter S

			// DRAW PACMEN FLOWER
			g.setColor(colour);
			g.fillArc(600, 500, 100, 100, 225, 270); // West pacman
			g.fillArc(725, 500, 100, 100, 45, 270); // East pacman
			g.fillArc(662, 435, 100, 100, 135, 270); // North pacman
			g.fillArc(662, 565, 100, 100, 315, 270); // South pacman

		}

	}
}
