package javaClass;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.MouseInfo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javaClass.KeyMouse.Key;

public class Freeform extends Applet {
	int c;
	
	public Freeform() {
		addKeyListener(new Key());
	}
	
	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Freeform();
		
		
		//main to run it
	}
	public class Key extends KeyAdapter {

		public void keyPressed(KeyEvent event) {

			int keyCode = event.getKeyCode();
			if (keyCode == KeyEvent.VK_B) { 
				
				c = 1;
			}else if (keyCode == KeyEvent.VK_W) { 
				c = 2;
				System.out.println("BUTTON PRESSED");

			}
				
			}
		}

    public void paint(Graphics g){

    	

        while(true)
        {
        
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
      //  System.out.println("X:" + mouseX);
       // System.out.println("Y:" + mouseY);
        if(c == 1) {
        	g.setColor(Color.BLACK);
        }
        else if(c == 2) {
        	g.setColor(Color.WHITE);
            System.out.println("BUTTON PRESSED");

        }
        g.drawRect((int)mouseX -10 , (int)mouseY - 50, 1, 1);
        
        
           
        }
        
       
        }
   

    }
        
        

    
 

