package javaClass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class KeyMouse extends JFrame {
<<<<<<< HEAD
//Variables

    int y, x;
//Double Buffer
    private Image dbImage;
    private Graphics dbg;

//Window Basics
    public KeyMouse() {
        addKeyListener(new AL());
        setTitle("Add window title");
        setSize(800, 700);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = 150;
        y = 150;

    }


    public static void main(String[] args) {
        new KeyMouse();
    }
    //Controls
    public class AL extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
            int keyCode = event.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT)
            {
                x-=5;
            }
            if (keyCode == KeyEvent.VK_RIGHT)
            {
                x+=5;
            }
            if (keyCode == KeyEvent.VK_UP)
            {
                y-=5;
            }
            if (keyCode == KeyEvent.VK_DOWN)
            {
                y+=5;
            }
        }

        @Override
        public void keyReleased(KeyEvent event) {
        }
    }


    @Override
    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void paintComponent(Graphics g) {
        g.fillOval(x, y, 15, 15);
        repaint();
    }
=======
	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Variables

	int y, x, b;

	// Double Buffer
	private Image dbImage;
	private Graphics dbg;

	// Window Basics
	public KeyMouse() {
		addKeyListener(new Key());
		setTitle("Snake");
		setSize(800, 700);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 150;
		y = 150;
		b = 0;

	}

	public static void main(String[] args) {
		new KeyMouse();
	}

	// Controls
	public class Key extends KeyAdapter {

		public void keyPressed(KeyEvent event) {

			int keyCode = event.getKeyCode();
			if (keyCode == KeyEvent.VK_LEFT) {
				b = 1;

			}
			if (keyCode == KeyEvent.VK_RIGHT) {
				b = 0;
			}
			if (keyCode == KeyEvent.VK_UP) {
				b = 2;
			}
			if (keyCode == KeyEvent.VK_DOWN) {
				b = 3;
			}

		}

	}

	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponenet(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}

	public void paintComponenet(Graphics g) {
		if (b == 1) {

			System.out.println(x);
			x -= 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			if (x < 10 || y < 10 || x > 800 || y > 700){
				KeyMouse.delay(1000000000);

			}

		} else if (b == 0) {
			x += 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			if (x < 10 || y < 10 || x > 800 || y > 700){
				KeyMouse.delay(1000000000);
			}
		}else if (b == 2){
			System.out.println(x);
			y -= 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			if (x < 10 || y < 10 || x > 800 || y > 700){
				KeyMouse.delay(1000000000);

			}
		}else if(b == 3){
			System.out.println(x);
			y += 2;
			repaint();
			g.fillOval(x, y, 15, 15);
			if (x < 10 || y < 10 || x > 800 || y > 700){
				KeyMouse.delay(1000000000);

			}
		} 
			

		KeyMouse.delay(10);

	}

>>>>>>> 72e294f1e40447f84701997d79dc446bbc96328c
}