package javaClass;
// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Lab06vst extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		
		
		// Draw Random Lines
		for (int k = 0; k <= 100; k++) {
			int x = (int) (Math.random() * 200);
		
		int x1 = (int) ((Math.random() * 200) + 100 );
		int y1 = (int) ((Math.random() * 200) + 100 );
		int y = (int) (Math.random() * 200);
		System.out.println(x);
		g.drawLine(x, y	, x1, y1);
		}

		
		
		
		
		



				
		
		// Draw Random Squares




		
		// Draw Random Circles




		
		// Draw 3-D Box
	
	
	
	
	
	}
		
}



    
 