package javaClass;

import java.util.*;

public class PizzaDeliveryAttempt2 {
	
	boolean pizza = false;
	boolean salad = false;
	boolean wings = false;
	
	boolean nineInch = false;
	boolean twelveInch = false;
	boolean sixteenInch = false;
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the pizza delivery service!");
		System.out.println("What would you like? We have pizza, wings, and salad");
	
	}
	public void firstScan() {
		while(true) {
		Scanner input = new Scanner (System.in);
		String typeFood = input.nextLine();
		
		if (typeFood.equalsIgnoreCase("pizza")) {
			pizza = true;
		}
		else if(typeFood.equalsIgnoreCase("wings")) {
			wings = true;
		}
		else if(typeFood.equalsIgnoreCase("salad")) {
			salad = true;
		}
		else {
			System.out.println("That is not one of the options");
		}
	}
	}
	public void pizzaSizeScan() {
		while(true) {
			System.out.println("We have 3 sizes: 9\", 12\", and 16\"");
			Scanner sizeInput = new Scanner(System.in);
			String pizzaSize = sizeInput.nextLine();
			
			if(pizzaSize.equalsIgnoreCase("9")) {
				nineInch = true;
			}
			else if(pizzaSize.equalsIgnoreCase("12")) {
				twelveInch = true;
			}
			else if(pizzaSize.equalsIgnoreCase("16")) {
				sixteenInch = true;
			}
			else {
				System.out.println("Please choose a valid size");
			}
		}
	}
}
