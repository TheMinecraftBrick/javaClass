package javaClass;


import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonTest extends Applet implements MouseListener{
	
	 
	   int x=0;
	   int y=0;

	  public void init()
	  {
		  addMouseListener(this);
	  }
	  public void start()
	  {
	  addMouseListener(this);
	  }
	  public void paint(Graphics g)
	  {
	     g.drawString("www.infolet.org", 100,100);
	  }
	  public void mouseClicked(MouseEvent e)
	  {
	    x = e.getX();
	    y = e.getY();
	    repaint();
	  }
	  public void mousePressed(MouseEvent e)
	  {
		
	  }
	  public void mouseReleased(MouseEvent e)
	  {

	  }
	  public void mouseEntered(MouseEvent e)
	  {

	  }
	  public void mouseExited(MouseEvent e)
	  {

	  }

	 }

