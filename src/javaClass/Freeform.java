package javaClass;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.MouseInfo;

public class Freeform extends Applet {
	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public void paint(Graphics g){

        

        while(true)
        {
        
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        System.out.println("X:" + mouseX);
        System.out.println("Y:" + mouseY);
        g.drawRect((int)mouseX -10 , (int)mouseY - 50, 1, 1);
        
           
        }
        
       
        }
        
        

    }
 

