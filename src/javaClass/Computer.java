package javaClass;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import javaClass.KeyMouse.Key;

public class Computer extends Applet {
	public static void reset(Graphics g)  {// reset the screen to blank
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 3000, 6000);
	}

	public void paint(Graphics g) {
		compScene.computer(g);
	}// paint for the main program

	public static class compScene {//new class for comp
		public static void computer(Graphics g) { //computer method
			
			Scanner input = new Scanner(System.in); //Input for password
			while (true) {
				Scanner input1 = new Scanner(System.in); //check for input
				System.out.println("Please Enter the password: ");
				String password = input1.nextLine();
				if (password.equalsIgnoreCase("memes")) { //password block. If password = memes, continue
					break; 
				}
			}
			
			
			
			System.out.println("Hello User, please enter your name: ");  //Some user interaction
			String name = input.nextLine();
			System.out.println("Welcome " + name + ", to The JAVA mini computer! A recode of the python version");
			while (true) {

				Comp.delay(1000);
				System.out.println(
						"Which program would you like to run " + name + "? (Type Prgms to list all the programs): ");
				Scanner input2 = new Scanner(System.in);
				String prgm = input2.nextLine(); // remember this string. its used to called every program from the main page
				
				

				if (prgm.equalsIgnoreCase("RPS")) { //rock paper scissors module

					while (true) {
						Scanner input3 = new Scanner(System.in);
						System.out.println("Type Exit to Leave or press Enter to continue: ");
						String exit = input3.nextLine();
						if (exit.equalsIgnoreCase("exit")) {
							break;
						} //check to see if you want to exit or play again
						
						
						System.out.println("Enter your choice, Rock, Paper, or Scissors: "); //input
						while (true) {

							Scanner input4 = new Scanner(System.in);
							String RPS = input3.nextLine(); // input scanner
							Random rand = new Random(); 
							int x = rand.nextInt(3) + 1;
							if (x == 1) { //x is the computer's choice so if x = 1, the computer chooses rock
								if (RPS.equalsIgnoreCase("Rock")) {
									System.out.println("Comp: Rock");
									Comp.delay(500);
									System.out.println("Tie game!");
									break;

								} else if (RPS.equalsIgnoreCase("Paper")) {
									System.out.println("Comp: Rock");
									Comp.delay(500);
									System.out.println("You Win!");
									break;

								} else if (RPS.equalsIgnoreCase("Scissors")) {
									System.out.println("Comp: Rock");
									Comp.delay(500);
									System.out.println("Comp Wins!");
									break;

								}
							} else if (x == 2) { // since x = 2, the comp chooses paper
								if (RPS.equalsIgnoreCase("Rock")) {
									System.out.println("Comp: Paper");
									Comp.delay(500);
									System.out.println("Comp Wins");
									break;
								} else if (RPS.equalsIgnoreCase("Paper")) {
									System.out.println("Comp: Paper");
									Comp.delay(500);
									System.out.println("Tie game!");
									break;
								} else if (RPS.equalsIgnoreCase("Scissors")) {
									System.out.println("Comp: paper");
									Comp.delay(500);
									System.out.println("You win!");
									break;
								}
							} else if (x == 3) { // since x = 3 comp choose scissors
								if (RPS.equalsIgnoreCase("Rock")) { 
									System.out.println("Comp: Scissors");
									Comp.delay(500);
									System.out.println("You win");
									break;
								} else if (RPS.equalsIgnoreCase("Paper")) {
									System.out.println("Comp: Scissors");
									Comp.delay(500);
									System.out.println("Comp wins!");
									break;
								} else if (RPS.equalsIgnoreCase("Scissors")) {
									System.out.println("Comp: Scissors");
									Comp.delay(500);
									System.out.println("Tie game!");
									break;

								}

							}
						}
					}
					
					
					

				} else if (prgm.equalsIgnoreCase("PRGMS")) {
					//list all the programs
					System.out.println("RPS, Lab5, Slots, Border Patrol, Order Pizza, Lab4a, Lab4b, Lab6, Hello,");

				} else if (prgm.equalsIgnoreCase("Lab5")) {
					reset(g);
					Lab05vst lab5 = new Lab05vst();
					lab5.paint(g); //lab 5

				} else if (prgm.equalsIgnoreCase("Slots")) {
					reset(g);
					slots s = new slots();	
					s.paint(g);//Slot machine code

				}else if (prgm.equalsIgnoreCase("Border Patrol")) {
					reset(g);
					KeyMouse key = new KeyMouse();
					key.paint(g);
					//Attempts at running border patrol
					
				}else if (prgm.equalsIgnoreCase("Order Pizza")) {
					PizzaDeliveryAttempt2.firstScan();
					//run the pizza program sabo made.
				}else if (prgm.equalsIgnoreCase("Freeform")) {
					reset(g);
					g.setColor(Color.BLACK);
					Freeform free = new Freeform();
					free.paint(g);
				}else if (prgm.equalsIgnoreCase("Lab6")) {
					reset(g);
					Lab06vst lab6 = new Lab06vst();
					lab6.paint(g); //lab 6
				}else if (prgm.equalsIgnoreCase("Lab4a")) {
					lab04avst.money();
					//lab 4a
				}else if (prgm.equalsIgnoreCase("Lab4b")) {
					reset(g);
					g.setColor(Color.WHITE);
					g.fillRect(0, 0, 3000, 6000);
					Lab04bvst lab4b = new Lab04bvst();
					lab4b.paint(g); //lab 4b
				}else if (prgm.equalsIgnoreCase("Hello")) {
				HelloWorld.hello();
				}else if (prgm.equalsIgnoreCase("Credits")) {
					reset(g);
					Comp.delay(100);
					Credits.credits(g);
				
				}
				

			}
		}
	}

}
