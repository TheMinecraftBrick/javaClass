package javaClass;

import java.math.BigDecimal;
import java.util.*;

//Created by Sabo

public class PizzaDeliveryAttempt2 {

	static boolean pizza = false;
	static boolean salad = false;
	static boolean wings = false;
	
	static boolean caesarDressing = false;
	static boolean frenchDressing = false;
	static boolean italianDressing = false;
	
	static boolean normalCroutons = false;
	static boolean spicyCroutons = false;
	static boolean softCroutons = false;
	
	static boolean addExtra;
	
	//By using booleans, the program can save and keep track of the choices made
	
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
				PizzaScans.pizzaSizeScan();
				//Runs method from a different class that is only for pizza related choices
			} 
			else if (typeFood.equalsIgnoreCase("wings")) {
				wings = true;
				WingsScans.wingsSauceScan();
				//Calls method from wings-specific class
			} else if (typeFood.equalsIgnoreCase("salad")) {
				salad = true;
				SaladScans.dressingScan();
				//Calls method form salad class
			} else {
				System.out.println("That is not one of the options");
				firstScan();
				//If the user does not type one of the options, the program runs the loop again 
			}
			//Original scan that determines what category of food is desired
			
		}
		while (pizza == false && salad == false && wings == false);
		
		}
	public static void addToCart() {
		System.out.println("Would you like to add anything else to your order?");
		
		do {
			Scanner cartInput = new Scanner(System.in);
			String addCart = cartInput.nextLine();
			
			if(addCart.equalsIgnoreCase("no")) {
				addExtra = false;
				calculateCost();
				//If "no" is typed, run the final method that makes the receipt
			}
			else if(addCart.equalsIgnoreCase("yes")) {
				addExtra = true;
				firstScan();
			}
			else {
				System.out.println("Type yes or no");
			}
		}
		while(addExtra != true && addExtra != false);
		//At the end of the selection process, the program asks if the user would like to add anything else to their order 
		//The method simply runs the original scan method if "yes" is typed
	}
	public static void calculateCost() {
		
		double basePizzaCost = 0;
		double baseWingsCost = 0;
		double baseSaladCost = 0;
		String initialPizzaReceipt = "";
		String initialWingsReceipt = "";
		String initialSaladReceipt = "";
		//Strings have to be initialized as null so that they can be used in "if" statements
		
		//The doubles are set to values based on which booleans are true
		//The strings are also set to certain things based on which booleans are true
		if(pizza == true) {
			basePizzaCost += 10.49;
			initialPizzaReceipt += "Pizza";
		}
		if(salad == true) {
			baseSaladCost += 8.49;
			initialSaladReceipt += "Salad";
		}
		if(wings == true) {
			baseWingsCost += 9.99;
			initialWingsReceipt += "Wings";
		}
		
		double pizzaSizeCost = 0;
		String pizzaSize = "";
		
		if(PizzaScans.nineInch == true) {
			pizzaSizeCost += 0;
			pizzaSize += "9\" ";
		}
		if(PizzaScans.twelveInch == true) {
			pizzaSizeCost += 1.49;
			pizzaSize += "12\" ";
		}
		if(PizzaScans.sixteenInch == true) {
			pizzaSizeCost += 2.99;
			pizzaSize += "16\" ";
		}
		
		double pizzaToppingCost = 0;
		String pizzaTopping = "";
		
		if(PizzaScans.pepperoni == true) {
			pizzaToppingCost += 0.99;
			pizzaTopping += "Pepperoni ";
		}
		if(PizzaScans.sausage == true) {
			pizzaToppingCost += 1.49;
			pizzaTopping += "Sausage ";
		}
		if(PizzaScans.bacon == true) {
			pizzaToppingCost += 1.99;
			pizzaTopping += "Bacon ";
		}
		
		double wingsSauceCost = 0;
		String wing = "";
		
		if(WingsScans.mildSauce == true) {
			wingsSauceCost += 0.99;
			wing += "Mild Sauce ";
		}
		if(WingsScans.mediumSauce == true) {
			wingsSauceCost += 1.49;
			wing += "Medium Sauce ";
		}
		if(WingsScans.hotSauce == true) {
			wingsSauceCost += 2.99;
			wing += "Hot Sauce ";
		}
		
		double boneCost = 0;
		String bone = "";
		
		if(WingsScans.boneNo == true) {
			boneCost += 1.99;
			bone += "Not Boneless ";
		}
		if(WingsScans.boneYes == true) {
			boneCost += 2.99;
			bone += "Boneless ";
		}
		
		double dressingCost = 0;
		String dressing = "";
		
		if(SaladScans.caesarDressing == true) {
			dressingCost += 0.99;
			dressing += "Caesar Dressing ";
		}
		if(SaladScans.frenchDressing == true) {
			dressingCost += 1.49;
			dressing += "French Dressing ";
		}
		if(SaladScans.italianDressing == true) {
			dressingCost += 1.99;
			dressing += "Italian Dressing ";
		}
		
		double croutonCost = 0;
		String crouton = "";
		
		if(SaladScans.normalCroutons == true) {
			croutonCost += 0.49;
			crouton += "Normal Croutons ";
		}
		if(SaladScans.spicyCroutons == true) {
			croutonCost += 2.99;
			crouton += "Spicy Croutons ";
		}
		if(SaladScans.softCroutons == true) {
			croutonCost += 1.49;
			crouton += "Soft Croutons ";
		}
		
		System.out.println();
		System.out.println();
		
		//"if" statements are used here rather than "else...if" statements so that multiple things can be true and the computer will still print the stirngs
		if(pizza == true) {
			System.out.println(initialPizzaReceipt);
			System.out.println(pizzaSize);
			System.out.println(pizzaTopping);
			System.out.println();
		}if(wings == true) {
			System.out.println(initialWingsReceipt);
			System.out.println(wing);
			System.out.println(bone);
			System.out.println();
		}if(salad == true) {
			System.out.println(initialSaladReceipt);
			System.out.println(dressing);
			System.out.println(crouton);
			System.out.println();
		//Prints the receipt
		}
		
		double totalCost = basePizzaCost + baseSaladCost + baseWingsCost + pizzaSizeCost + pizzaToppingCost + wingsSauceCost + boneCost + dressingCost + croutonCost;
		int decimalPlaces = 2;
		BigDecimal bd = new BigDecimal(totalCost);
		bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
		totalCost = bd.doubleValue();
		//Makes the final number have two decimal places
		
		System.out.println("Your total cost:  $" + totalCost);
		
	}
}
