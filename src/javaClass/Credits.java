package javaClass;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Credits extends Applet {

	public void paint(Graphics g) {
		credits(g);
	}

	public void credits(Graphics g) {
		
		int width = 50;
		int height = 550;
		int fontSize = 70;
		
		int width2 = 50;
		int height2 = 550;
		int fontSize2 = 70;
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		
		g.setFont(new Font("Credits Font", Font.BOLD, 40));
		g.setColor(Color.blue);
		g.drawString("A long time ago in a computer lab", 25, 250);
		g.drawString("far, far away...", 25, 300);
		g.setColor(Color.BLACK);
		Comp.delay(3000);
		g.drawString("A long time ago in a computer lab", 25, 250);
		g.drawString("far, far away...", 25, 325);
		
		g.setFont(new Font("Credits Font", Font.BOLD, fontSize));
		
		g.setColor(Color.yellow);
		g.drawString("JAVA Mini Computer", width, height);
		Comp.delay(200);
		g.setColor(Color.BLACK);
		g.drawString("JAVA Mini Computer", width, height);

		for (int x = 0; x <= 70; x++) {
			Comp.delay(100);
			g.setColor(Color.black);
			g.drawString("JAVA Mini Computer", width, height);
			g.setColor(Color.yellow);
			fontSize--;
			width += 5;
			height -= 5;
			g.setFont(new Font("Credits Font", Font.BOLD, fontSize));
			g.drawString("JAVA Mini Computer", width, height);
			
			
			
		}

	}
}
