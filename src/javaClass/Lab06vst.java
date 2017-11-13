package javaClass;
// Lab06vst.java

// Student Version

/* Created by Kush Dalal on 11/10/17
* completed on 11/12/17
* V1.4
*/
import java.awt.*;
import java.applet.*;
import java.util.*;

public class Lab06vst extends Applet {
	/* ignore all this for now
	 
	  public static void color(Color colour){
		int r = (int) (Math.random() *(255)); //Choose a random color between 0 and 255 (RGB colors 0-255)
		int gr = (int) (Math.random() *(255));
		int b = (int) (Math.random() *(255));
		
		colour = new Color(r, gr, b); // define colour as red green and blue numbers
	}*/

	public void paint(Graphics g) {
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		// Draw Random Lines
		//Our beautiful "for" loop to get those 100 lines so we don't have to copy paste this 100 times
		for (int k = 1; k <= 100; k++) {
			
			//Random Color generator
			int r = (int) (Math.random() *(255)); //Choose a random color between 0 and 255 (RGB colors 0-255)
			int gr = (int) (Math.random() *(255));
			int b = (int) (Math.random() *(255));
			Color colour = new Color(r, gr, b); // define colour as red green and blue numbers
			g.setColor(colour); // set the color of them lines to that random color we made
			
			//The random line generator
			int x = 10 + (int) (Math.random() *(400 - 10) + 1); // integer x is a random number between 10 and 400
			int y = 10 + (int) (Math.random() *(300 - 10) + 1); // integer x is a random number between 10 and 300
			int x1 = 10 + (int) (Math.random() *(400 - 10) + 1);
			int y1 = 10 + (int) (Math.random() *(300 - 10) + 1);
			
			System.out.println(x + " - " + k); //Proof / Checking for if its 100 lines
			
			g.drawLine(x, y, x1, y1); //draw the lines here
		}

		// Draw Random Squares
		//for loop again.. you get the idea
		for (int k = 1; k <= 100; k++) {
			
			//color module
			int r = (int) (Math.random() *(255)); //Choose a random color between 0 and 255 (RGB colors 0-255)
			int gr = (int) (Math.random() *(255));
			int b = (int) (Math.random() *(255));
			Color colour = new Color(r, gr, b); // define colour as red green and blue numbers
			g.setColor(colour); // set the color of them lines to that random color we made
			
		int x = 400 + (int) (Math.random() *(800 - 475) + 1);// location for squares
		int y = 10 + (int) (Math.random() *(250 - 10) + 1);
		g.fillRect(x, y, 50, 50);//size and creation of square
		}

		// Draw Random Circles
		for (int k = 1; k <= 100; k++) {
			
			int r = (int) (Math.random() *(255));
			int gr = (int) (Math.random() *(255));
			int b = (int) (Math.random() *(255));
			
			Color colour = new Color(r, gr, b); 
			g.setColor(colour); 
			
			
			/*
			  more to ignore:
			 
			 Lab06vst.color(colour);
			g.setColor(colour); // set the color of them lines to that random color we made*/

			
	
			int d = (int) (Math.random() *(200) + 1);	// define d as the random diameter of the circle
			int x = 400 - d; //formula to prevent the circle being too large and going out of the box
			int y = 600 - d;
			
			int xPos = 10 + (int) (Math.random() * (x - 10) + 1); //random pos within our x that was given via formula
			int yPos = 300 + (int) (Math.random() * (y - 310) + 1); //same for y

			g.drawOval(xPos, yPos, d, d); // draw the circle
			
		}

		// Draw 3-D Box
		
		//Trapazoid polygon
		g.setColor(Color.YELLOW); //yellow color
		Polygon trap = new Polygon();
		trap.addPoint(550, 350);
		trap.addPoint(650, 350);
		trap.addPoint(650, 400);
		trap.addPoint(600, 400);
		trap.addPoint(550, 350);
		g.fillPolygon(trap);
		
		//Rhombus polygon
		g.setColor(Color.GREEN); //green color
		Polygon rhombus = new Polygon();
		rhombus.addPoint(550, 350);
		rhombus.addPoint(600, 400);
		rhombus.addPoint(600, 500);
		rhombus.addPoint(550, 450);
		g.fillPolygon(rhombus);

		//square polygon
		g.setColor(Color.RED);//red color
		Polygon square = new Polygon();
		square.addPoint(600, 400);
		square.addPoint(600, 500);
		square.addPoint(700, 500);
		square.addPoint(700, 400);
		g.fillPolygon(square);
		
		//triangle polygon
		g.setColor(Color.BLUE);		//blue color
		Polygon triangle = new Polygon();
		triangle.addPoint(650, 350);
		triangle.addPoint(650, 400);
		triangle.addPoint(700, 400);
		g.fillPolygon(triangle);	

	}

}
