package javaClass;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import javaClass.KeyMouse.Key;

public class Computer extends Applet {
	

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
			
			
			System.out.println("Hello User, please enter your name: ");
			String name = input.nextLine();
			System.out.println("Welcome " + name + ", to The JAVA mini computer! A recode of the python version");
			while (true) {

				Comp.delay(1000);
				System.out.println(
						"Which program would you like to run " + name + "? (Type Prgms to list all the programs): ");
				Scanner input2 = new Scanner(System.in);
				String prgm = input2.nextLine();

				if (prgm.equalsIgnoreCase("RPS")) {

					while (true) {
						Scanner input3 = new Scanner(System.in);
						System.out.println("Type Exit to Leave or press Enter to continue: ");
						String exit = input3.nextLine();
						if (exit.equalsIgnoreCase("exit")) {
							break;
						}
						System.out.println("Enter your choice, Rock, Paper, or Scissors: ");
						while (true) {

							Scanner input4 = new Scanner(System.in);
							String RPS = input3.nextLine();
							Random rand = new Random();
							int x = rand.nextInt(3) + 1;
							if (x == 1) {
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
							} else if (x == 2) {
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
							} else if (x == 3) {
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
					System.out.println("RPS, Lab5, Slots, Border Patrol, Order Pizza");
				} else if (prgm.equalsIgnoreCase("Lab5")) {
					Lab05vst lab5 = new Lab05vst();
					lab5.paint(g); //lab 5

				} else if (prgm.equalsIgnoreCase("Slots")) {
					slots s = new slots();	
					s.paint(g);//Slot machine code

				}else if (prgm.equalsIgnoreCase("Border Patrol")) {
					KeyMouse key = new KeyMouse();
					key.paint(g);
					//Attempts at running border patrol
					
				}else if (prgm.equalsIgnoreCase("Order Pizza")) {
					PizzaDeliveryAttempt2.firstScan();
				}else if (prgm.equalsIgnoreCase("Freeform")) {
					Freeform free = new Freeform();
					free.paint(g);
				}

			}
		}
	}

}
