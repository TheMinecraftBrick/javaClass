package javaClass;

import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.applet.*;

public class slots extends Applet {
	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		int money = 250;
		g.drawString("Money: $" + money, 10, 20);
		while (true) {
			
			System.out.println("Enter your bet: ");
			Scanner input2 = new Scanner(System.in);
			int bet = input2.nextInt();
			g.setColor(Color.WHITE);
			g.drawString("Money: $" + money, 10, 20);
			
			
			money = money - bet;
			if(money < 0){
				System.out.println("Insert more money to continue");
				money = 0;
				break;
			}
			
			g.setColor(Color.BLACK);
			
			g.drawString("Money: $" + money  , 10, 20);
			while(true){
			
			System.out.println("Type spin to spin again: ");
			Scanner input1 = new Scanner(System.in);
			String spin = input1.nextLine();
			if (spin.equalsIgnoreCase("spin")) {

				for (int k = 0; k < 35; k++) {
					Random rand2 = new Random();
					int x = rand2.nextInt(255) + 1;
					int y = rand2.nextInt(255) + 1;
					int z = rand2.nextInt(255) + 1;
					Color colour = new Color(x, y, z);

					g.setColor(colour);
					slots.delay(100);
					g.fillRect(100, 100, 50, 50);
				}

				slots.delay(100);
				Random rand = new Random();
				int x = rand.nextInt(8) + 1;
				switch (x) {
				case 1:
					g.setColor(Color.RED);
					break;
				case 2:
					g.setColor(Color.ORANGE);
					break;
				case 3:
					g.setColor(Color.YELLOW);
					break;
				case 4:
					g.setColor(Color.GREEN);
					break;
				case 5:
					g.setColor(Color.BLUE);
					break;
				case 6:
					g.setColor(Color.BLACK);
					break;
				case 7:
					g.setColor(Color.MAGENTA);
					break;
				case 8:
					g.setColor(Color.PINK);
					break;
				default:
					System.out.println("You Done screwed up");
				}
				g.fillRect(100, 100, 50, 50);

				for (int k1 = 0; k1 < 35; k1++) {
					Random rand3 = new Random();
					int R = rand3.nextInt(255) + 1;
					int G = rand3.nextInt(255) + 1;
					int B = rand3.nextInt(255) + 1;
					Color colour = new Color(R, G, B);

					g.setColor(colour);
					slots.delay(100);
					g.fillRect(200, 100, 50, 50);
				}

				slots.delay(100);
				Random randb = new Random();
				int x1 = randb.nextInt(8) + 1;
				switch (x1) {
				case 1:
					g.setColor(Color.RED);
					break;
				case 2:
					g.setColor(Color.ORANGE);
					break;
				case 3:
					g.setColor(Color.YELLOW);
					break;
				case 4:
					g.setColor(Color.GREEN);
					break;
				case 5:
					g.setColor(Color.BLUE);
					break;
				case 6:
					g.setColor(Color.BLACK);
					break;
				case 7:
					g.setColor(Color.MAGENTA);
					break;
				case 8:
					g.setColor(Color.PINK);
					break;
				default:
					System.out.println("You Done screwed up");
				}
				g.fillRect(200, 100, 50, 50);

				for (int k2 = 0; k2 < 35; k2++) {
					Random rand4 = new Random();
					int R1 = rand4.nextInt(255) + 1;
					int G1 = rand4.nextInt(255) + 1;
					int B1 = rand4.nextInt(255) + 1;
					Color colour = new Color(R1, G1, B1);

					g.setColor(colour);
					slots.delay(100);
					g.fillRect(300, 100, 50, 50);
				}

				slots.delay(100);
				Random randy = new Random();
				int x2 = randy.nextInt(8) + 1;
				switch (x2) {
				case 1:
					g.setColor(Color.RED);
					break;
				case 2:
					g.setColor(Color.ORANGE);
					break;
				case 3:
					g.setColor(Color.YELLOW);
					break;
				case 4:
					g.setColor(Color.GREEN);
					break;
				case 5:
					g.setColor(Color.BLUE);
					break;
				case 6:
					g.setColor(Color.BLACK);
					break;
				case 7:
					g.setColor(Color.MAGENTA);
					break;
				case 8:
					g.setColor(Color.PINK);
					break;
				default:
					System.out.println("You Done screwed up");
				}
				g.fillRect(300, 100, 50, 50);
				

				if (x1 == x2 && x2 == x) {
					g.setColor(Color.WHITE);
					g.fillRect(150, 150, 300, 300);
					slots.delay(100);
					g.setColor(Color.GREEN);
					
					g.drawString("Congratz! You won 3x your money!", 150, 200);
					g.setColor(Color.WHITE);
					g.drawString("Money: $" + money, 10, 20);
					money = bet * 3 + money;
					g.setColor(Color.BLACK);
					g.drawString("Money: $" + money, 10, 20);
					
				} else if (x1 == x2 || x1 == x || x2 == x) {
					g.setColor(Color.WHITE);
					g.fillRect(150, 150, 300, 300);
					slots.delay(100);
					g.setColor(Color.ORANGE);
					g.drawString("Good job! you got two for 2x money", 150, 200);
					g.setColor(Color.WHITE);
					g.drawString("Money: $" + money, 10, 20);
					money = bet * 2 + money;
					g.setColor(Color.BLACK);
					g.drawString("Money: $" + money, 10, 20);

				} else {
					g.setColor(Color.WHITE);
					g.fillRect(150, 150, 300, 300);
					slots.delay(100);
					g.setColor(Color.WHITE);
					g.drawString("Money: $" + money, 10, 20);
					g.setColor(Color.RED);

					g.drawString("Nice try. better luck next time!", 150, 200);
					
					g.setColor(Color.BLACK);
					g.drawString("Money: $" + money, 10, 20);

				}
				
			}
			break;

		}
			
		}
	}

}
