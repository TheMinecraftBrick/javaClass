package javaClass;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.MouseInfo;

public class Cords extends Applet {
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
        Cords.delay(50);
        System.out.println("X:" + mouseX);
        System.out.println("Y:" + mouseY);
       
        
        double mouseX2 = MouseInfo.getPointerInfo().getLocation().getX();
      
       
        if(mouseX != mouseX2) {
        	g.setColor(Color.WHITE);
            g.fillRect((int) mouseX, 400, 1000, 50);
            
        	g.setColor(Color.YELLOW);
            g.fillRect((int) mouseX, 400, 100, 50);
         
           
        }
       
        }
        
        
        

    }
 

}