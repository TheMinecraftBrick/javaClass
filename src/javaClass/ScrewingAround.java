package javaClass;

import java.util.*;

public class ScrewingAround {
	public static void main(String[] args) {

		

		System.out.println("Welcome to the marching band pizza delivery!");
		System.out.println();
		int choice1 = 0;
		// 0 means nothing was selected, 1 is pizza, 2 is wings, and 3 is salad
		while (true) { 
			Scanner input = new Scanner(System.in);
			System.out.println("Would you like pizza, wings, or salad?");
			String typeFood = input.nextLine();

			if (typeFood.equalsIgnoreCase("pizza")) {
				System.out.println("What size pizza would you like? We offer a 9\", 12\", and 16\"");
				choice1 = 1;
				break;
			} else if (typeFood.equalsIgnoreCase("wings")) {
				choice1 = 2;
				break;

			} else if (typeFood.equalsIgnoreCase("salad")) {
				System.out.println("What dressing would you like on your salad? We offer caesar, French, and Italian");
				choice1 = 3;
				break;
			} else {
				System.out.println("That is not a valid option, please choose again");
			}
			break;
		}
		int pizzaSize = 0;
		if (choice1 == 1) {
			
			while (true) {
				Scanner input1 = new Scanner(System.in);
				String sizePizza = input1.nextLine();

				
				// Same kind of thing here, 0 means nothing, 1 means 9", 2 means 12", and 3
				// means 16"

				if (sizePizza.equalsIgnoreCase("9")) {
					System.out.println("We have 3 topping choices: pepperoni, sausage, and bacon");
					pizzaSize = 1;
					break;
				} else if (sizePizza.equalsIgnoreCase("12")) {
					System.out.println("We have 4 topping choices: pepperoni, sausage, bacon, and green pepper");
					pizzaSize = 2;
					break;
				} else if (sizePizza.equalsIgnoreCase("16")) {
					System.out.println("We have 5 topping choices: pepperoni, sausage, bacon, green pepper, and olives");
					pizzaSize = 3;
					break;

				}
			
				else {
					System.out.println("Choose a correct size");
				}
			}
			}
			int topping = 0;
			int saladDressing = 0;
			int bone = 0;
			int crouton = 0;
			int sauceType = 0;
			while(true) {
				Scanner input5 = new Scanner(System.in);
				String toppings = input5.nextLine();
				if(pizzaSize == 1) {
					if(toppings.equalsIgnoreCase("pepperoni")) {
						System.out.println("You are a basic white girl.");
						topping = 1;
						break;
					}
					else if(toppings.equalsIgnoreCase("sausage")) {
						System.out.println("You like that meat, don't you?");
						topping = 2;
						break;
					}
					else if(toppings.equalsIgnoreCase("bacon")) {
						System.out.println("Clearly the best option");
						topping = 3;
						break;
					}
					else {
						System.out.println("Please choose a correct topping, this size has pepperoni, sausage, and bacon available.");
					}
				}
				else if(pizzaSize == 2) {
					if(toppings.equalsIgnoreCase("pepperoni")) {
						System.out.println("You are a basic white girl.");
						topping = 1;
						break;
					}
					else if(toppings.equalsIgnoreCase("sausage")) {
						System.out.println("You like that meat, don't you?");
						topping = 2;
						break;
					}
					else if(toppings.equalsIgnoreCase("bacon")) {
						System.out.println("Clearly the best option");
						topping = 3;
						break;
					}
					else if(toppings.equalsIgnoreCase("green pepper")) {
						System.out.println("Wyd");
						topping = 4;
						break;
					}
					else {
						System.out.println("Please choose a correct topping, this size has pepperoni, sausage, bacon, and green pepper available.");
					}
				}
				else if(pizzaSize == 3) {
					if(toppings.equalsIgnoreCase("pepperoni")) {
						System.out.println("You are a basic white girl.");
						topping = 1;
						break;
					}
					else if(toppings.equalsIgnoreCase("sausage")) {
						System.out.println("You like that meat, don't you?");
						topping = 2;
						break;
					}
					else if(toppings.equalsIgnoreCase("bacon")) {
						System.out.println("Clearly the best option");
						topping = 3;
						break;
					}
					else if(toppings.equalsIgnoreCase("green pepper")) {
						System.out.println("Wyd");
						topping = 4;
						break;
					}
					else if(toppings.equalsIgnoreCase("olives")) {
						System.out.println("olives it is");
						topping = 5;
						break;
					}
					else {
						System.out.println("Please choose a correct topping, this size has pepperoni, sausage, bacon, and green pepper available.");
				}
					break;
			}
					
		 else if (choice1 == 3) {
			 
			while (true) {
				Scanner input2 = new Scanner(System.in);
				String typeSalad = input2.nextLine();

				
				// 0 means nothing, 1 means caesar, 2 means french, and 3 means italian
				if (typeSalad.equalsIgnoreCase("caesar")) {
					System.out.println("Would you like croutons on your salad?");
					saladDressing = 1;
					break;
				} else if (typeSalad.equalsIgnoreCase("french")) {
					System.out.println("Would you like croutons on your salad?");
					saladDressing = 2;
					break;
				} else if (typeSalad.equalsIgnoreCase("italian")) {
					System.out.println("Would you like croutons on your salad?");
					saladDressing = 3;
					break;
				}
				else {
					System.out.println("That's not a dressing\n");
					System.out.println("Pick a dressing");
				}
				break;
			}
			
			
			while(true) {
				Scanner input4 = new Scanner(System.in);
				String croutons = input4.nextLine();
				if(croutons.equalsIgnoreCase("yes")) {
					System.out.println("good choice");
					crouton = 1;
					break;
				}
				else if(croutons.equalsIgnoreCase("no")) {
					System.out.println("y tho");
					crouton = 2;
					break;
				}
				else {
					System.out.println("Type yes or no, its not that hard\n");
					System.out.println("Do you want croutons?");
				}
				break;
			}
			break;
		}
				
		 else if (choice1 == 2) {
			
			// 0 means nothing, 1 means yes, and 2 means no
			System.out.println("Would you like your wings to be boneless?");
			while (true) {
				
				Scanner input3 = new Scanner(System.in);
				String boneless = input3.nextLine();
				//problem - cannot give input
				if (boneless.equalsIgnoreCase("yes")) {
					System.out.println("Would you like mild, medium, or hot sauce?");
					bone = 1;
					break;
				} else if (boneless.equalsIgnoreCase("no")) {
					System.out.println("Would you like mild, medium, or hot sauce?");
					bone = 2;
					break;
				} else {
					System.out.println("Please choose again.");
				}
				break;
			}
		
			while(true) {
				Scanner input4 = new Scanner(System.in);
				String sauce = input4.nextLine();
				if(sauce.equalsIgnoreCase("mild")) {
					System.out.println("lame");
					sauceType = 1;
					break;
				}
				else if(sauce.equalsIgnoreCase("medium")) {
					System.out.println("CORN SALSA");
					sauceType = 2;
					break;
				}
				else if(sauce.equalsIgnoreCase("hot")) {
					System.out.println("good choice");
					sauceType = 3;
					break;
				}
				else {
					System.out.println("That's not a sauce!");
				}
			break;
			}
		break;
			
			
		}
		}
			String firstChoice = "";
			String sizePizza = "";
			String toppings = "";
			String dressing = "";
			String croutons = "";
			String boneless = "";
			String typeSauce = "";
			
			double pizzaSize$ = 0;
			double toppings$ = 0;
			double salad$ = 0;
			double croutons$ = 0;
			double bone$ = 0;
			double sauce = 0;
			
		if(choice1 == 1) {
			firstChoice = "pizza";
		}
		else if(choice1 == 2) {
			firstChoice = "wings";
		}
		else if(choice1 == 3) {
			firstChoice = "salad";
		}
		if(pizzaSize == 1) {
			sizePizza = "9\"";
			pizzaSize$ = 10.49;
		}
		else if(pizzaSize == 2) {
			sizePizza = "12\"";
			pizzaSize$ = 14.49;
		}
		else if(pizzaSize == 3) {
			sizePizza = "16\"";
			pizzaSize$ = 16.49;
		}
		if(topping == 1) {
			toppings = "pepperoni";
		}
		else if(topping == 2) {
			toppings = "sausage";
			toppings$ = 1.99;
		}
		else if(topping == 3) {
			toppings = "bacon";
			toppings$ = 2.99;
		}
		else if(topping == 4) {
			toppings = "green pepper";
			toppings$ = 3.99;
		}
		else if(topping == 5) {
			toppings = "olives";
			toppings$ = 3.99;
		}
		if(saladDressing == 1) {
			dressing = "caesar dressing";
			salad$ = 5.99;
		}
		else if(saladDressing == 2) {
			dressing = "French dressing";
			salad$ = 6.49;
		}
		else if(saladDressing == 3) {
			dressing = "Italian dressing";
			salad$ = 8.49;
		}
		if(crouton == 1) {
			croutons = "croutons";
			croutons$ = 1.99;
		}
		else if(crouton == 2) {
			croutons = "no croutons";
			croutons$ = 0;
		}
		if(bone == 1) {
			boneless = "boneless";
			bone$ = 8.99;
		}
		else if(bone == 2) {
			boneless = "not boneless";
			bone$ = 10.99;
		}
		if(sauceType == 1) {
			typeSauce = "mild sauce";
			sauce = 2.99;
		}
		else if(sauceType == 2) {
			typeSauce = "medium sauce";
			sauce = 4.99;
		}
		else if(sauceType == 3) {
			typeSauce = "hot sauce";
			sauce = 6.99;
		}
		
		System.out.println();
		System.out.println("Here is your final order:");
		System.out.println(firstChoice);
		System.out.print(sizePizza);
		System.out.println(toppings);
		System.out.println(dressing);
		System.out.print(croutons);
		System.out.println(boneless);
		System.out.println(typeSauce);
		double total = pizzaSize$ + toppings$ + salad$ + croutons$ + bone$ + sauce;
		System.out.print("Total: $" + total); //add the doubles
		
	
}
}
	
	

