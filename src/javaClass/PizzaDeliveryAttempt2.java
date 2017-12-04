package javaClass;

import java.util.*;

public class PizzaDeliveryAttempt2 {

	static boolean pizza = false;
	static boolean salad = false;
	static boolean wings = false;

	static boolean nineInch = false;
	static boolean twelveInch = false;
	static boolean sixteenInch = false;

	static boolean pepperoni = false;
	static boolean sausage = false;
	static boolean bacon = false;
	
	static boolean mildSauce = false;
	static boolean mediumSauce = false;
	static boolean hotSauce = false;

	public static void main(String[] args) {
		
		firstScan();
		
	}

	public static void firstScan() {
		System.out.println("Welcome to the pizza delivery service!");

		do{
			System.out.println("What would you like? We have pizza, wings, and salad");
			Scanner input = new Scanner(System.in);
			String typeFood = input.nextLine();
			
			if (typeFood.equalsIgnoreCase("pizza")) {
				pizza = true;
				pizzaSizeScan();
			} 
			else if (typeFood.equalsIgnoreCase("wings")) {
				wings = true;
				wingsSauceScan();
			} else if (typeFood.equalsIgnoreCase("salad")) {
				salad = true;
			} else {
				System.out.println("That is not one of the options");
				firstScan();
			}
			
		}
		while (pizza == false && salad == false && wings == false);
		
		}
	
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
				topping = toppingInput.nextLine();
			}
		}
		while (pepperoni == false && sausage == false && bacon == false);
	
	}
	
	public static void wingsSauceScan() {
		
		do {
			System.out.println("What sauce would you like? We have a mild, medium, and hot sauce");
			Scanner sauceInput = new Scanner(System.in);
			String sauce = sauceInput.nextLine();
				if(sauce.equalsIgnoreCase("mild")) {
					mildSauce = true;
				}
				else if(sauce.equalsIgnoreCase("medium")) {
					mediumSauce = true;
				}
				else if(sauce.equalsIgnoreCase("hot")) {
					hotSauce = true;
				}
				else {
					System.out.println("That is not a sauce type");
					wingsSauceScan();
				}
		}
		while(mildSauce == false && mediumSauce == false && hotSauce == false);
	}

}
