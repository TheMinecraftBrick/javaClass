package javaClass;

import java.awt.*;
import java.util.Scanner;

public class PizzaScans extends PizzaDeliveryAttempt2 {
	
	static boolean nineInch = false;
	static boolean twelveInch = false;
	static boolean sixteenInch = false;

	static boolean pepperoni = false;
	static boolean sausage = false;
	static boolean bacon = false;
	
	public static void pizzaSizeScan() {
		
		do  {
			
			System.out.println("We have 3 sizes: 9\", 12\", and 16\"");
			Scanner sizeInput = new Scanner(System.in);
			String pizzaSize = sizeInput.nextLine();
			
			if (pizzaSize.equalsIgnoreCase("9")) {
				nineInch = true;
				pizzaToppingScan();
			} else if (pizzaSize.equalsIgnoreCase("12")) {
				twelveInch = true;
				pizzaToppingScan();
			} else if (pizzaSize.equalsIgnoreCase("16")) {
				sixteenInch = true;
				pizzaToppingScan();
			} else {
				System.out.println("Please choose a valid size");
				pizzaSizeScan();
			}
			
		}
		while (nineInch == false && twelveInch == false && sixteenInch == false);
		
	}

	public static void pizzaToppingScan() {
		
		do {	
		System.out.println("We have three topping choices: pepperoni, sausage, and bacon");
		Scanner toppingInput = new Scanner(System.in);
		String topping = toppingInput.nextLine();
			if (topping.equalsIgnoreCase("pepperoni")) {
				pepperoni = true;
			} else if (topping.equalsIgnoreCase("sausage")) {
				sausage = true;
			} else if (topping.equalsIgnoreCase("bacon")) {
				bacon = true;
			} else {
				System.out.println("That is not one of our toppings");
			}
		}
		while (pepperoni == false && sausage == false && bacon == false);
		PizzaDeliveryAttempt2.addToCart();
	
	}

}
