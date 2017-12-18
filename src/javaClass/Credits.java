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
		
		int width = -200;
		int height = 400;
		int fontSize = 175;
		
		int width2 = 15;
		int height2 = 650;
		int fontSize2 = 80;
		
		int width3 = 15;
		int height3 = 650;
		int fontSize3 = 80;
		
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1920, 1080);
		
		g.setFont(new Font("Serif Gothic", Font.BOLD, 40));
		Color Swblue = new Color(22, 206, 214);
		g.setColor(Swblue);
		g.drawString("A long time ago in a computer lab", 25, 250);
		g.drawString("far, far away...", 25, 300);
		g.setColor(Color.BLACK);
		Comp.delay(3000);
		g.drawString("A long time ago in a computer lab", 25, 250);
		g.drawString("far, far away...", 25, 300);
		
		g.setFont(new Font("Bauhaus 93", Font.BOLD, fontSize));
		
		g.setColor(Color.yellow);
		g.drawString("JAVA Mini Computer", width, height);
		Comp.delay(200);
		g.setColor(Color.BLACK);
		g.drawString("JAVA Mini Computer", width, height);
		
		for (int x = 0; x <= 100; x++) {
			Comp.delay(100);
		
			g.setFont(new Font("Bauhaus 93", Font.BOLD, fontSize));
			g.setColor(Color.black);
			g.drawString("JAVA Mini Computer", width, height);
			
			g.setColor(Color.yellow);
			fontSize -= 5;
			width += 17;
			height -= 5;
		
			g.setFont(new Font("Bauhaus 93", Font.BOLD, fontSize));
			g.drawString("JAVA Mini Computer", width, height);
			
			if(fontSize <= 0) {
				Comp.delay(1000);
				break;
				
			}
		}
		for(int y = 0; y <= 100; y++) {
			Comp.delay(100);
			g.setColor(Color.black);
			g.drawString("By: Ben and Kush", width2, height2);
			fontSize2--;
			width2 += 5;
			height2 -= 7;
			g.setFont(new Font("Bauhaus 93", Font.BOLD, fontSize2));
			g.setColor(Color.YELLOW);
			g.drawString("By: Ben and Kush", width2, height2);
			
			if(fontSize2 <= 0) {
				break;
			}
		}
		for(int y = 0; y <= 100; y++) {
			Comp.delay(100);
			g.setColor(Color.black);
			g.drawString("By: Ben and Kush", width2, height2);
			fontSize2--;
			width2 += 5;
			height2 -= 7;
			g.setFont(new Font("Bauhaus 93", Font.BOLD, fontSize2));
			g.setColor(Color.YELLOW);
			g.drawString("By: Ben and Kush", width2, height2);
			if(fontSize2 <= 0) {
				
				break;
			}
		}
		
	}
}
