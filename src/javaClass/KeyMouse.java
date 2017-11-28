package javaClass;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class KeyMouse extends JFrame {
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
            if (keyCode == event.VK_LEFT)
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
}