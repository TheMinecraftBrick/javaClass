package javaClass;

import java.util.*;

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
	
	public static void main(String[] args) {
		
		firstScan();
		calculateCost();
		
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
			} 
			else if (typeFood.equalsIgnoreCase("wings")) {
				wings = true;
				WingsScans.wingsSauceScan();
			} else if (typeFood.equalsIgnoreCase("salad")) {
				salad = true;
				SaladScans.dressingScan();
			} else {
				System.out.println("That is not one of the options");
				firstScan();
			}
			
		}
		while (pizza == false && salad == false && wings == false);
		
		}
	public static void calculateCost() {
		
		double baseCost = 0;
		String initialReceipt = null;
		
		if(pizza == true) {
			baseCost = 10.49;
			initialReceipt = "Pizza";
		}
		else if(salad == true) {
			baseCost = 8.49;
			initialReceipt = "Salad";
		}
		else if(wings == true) {
			baseCost = 9.99;
			initialReceipt = "Wings";
		}
		
		double pizzaSizeCost = 0;
		String pizzaSize = null;
		
		if(PizzaScans.nineInch == true) {
			pizzaSizeCost = 0;
			pizzaSize = "9\"";
		}
		else if(PizzaScans.twelveInch == true) {
			pizzaSizeCost = 1.49;
			pizzaSize = "12\"";
		}
		else if(PizzaScans.sixteenInch == true) {
			pizzaSizeCost = 2.99;
			pizzaSize = "16\"";
		}
		
		double pizzaToppingCost = 0;
		String pizzaTopping = null;
		
		if(PizzaScans.pepperoni == true) {
			pizzaToppingCost = 0.99;
			pizzaTopping = "Pepperoni";
		}
		else if(PizzaScans.sausage == true) {
			pizzaToppingCost = 1.49;
			pizzaTopping = "Sausage";
		}
		else if(PizzaScans.bacon == true) {
			pizzaToppingCost = 1.99;
			pizzaTopping = "Bacon";
		}
		
		double wingsSauceCost = 0;
		String wing = null;
		
		if(WingsScans.mildSauce == true) {
			wingsSauceCost = 0.99;
			wing = "Mild Sauce";
		}
		else if(WingsScans.mediumSauce == true) {
			wingsSauceCost = 1.49;
			wing = "Medium Sauce";
		}
		else if(WingsScans.hotSauce == true) {
			wingsSauceCost = 2.99;
			wing = "Hot Sauce";
		}
		
		double boneCost = 0;
		String bone = null;
		
		if(WingsScans.boneNo == true) {
			boneCost = 1.99;
			bone = "Not Boneless";
		}
		else if(WingsScans.boneYes == true) {
			boneCost = 2.99;
			bone = "Boneless";
		}
		
		double dressingCost = 0;
		String dressing = null;
		
		if(SaladScans.caesarDressing == true) {
			dressingCost = 0.99;
			dressing = "Caesar Dressing";
		}
		else if(SaladScans.frenchDressing == true) {
			dressingCost = 1.49;
			dressing = "French Dressing";
		}
		else if(SaladScans.italianDressing == true) {
			dressingCost = 1.99;
			dressing = "Italian Dressing";
		}
		
		double croutonCost = 0;
		String crouton = null;
		
		if(SaladScans.normalCroutons == true) {
			croutonCost = 0.49;
			crouton = "Normal Croutons";
		}
		else if(SaladScans.spicyCroutons == true) {
			croutonCost = 2.99;
			crouton = "Spicy Croutons";
		}
		else if(SaladScans.softCroutons == true) {
			croutonCost = 1.49;
			crouton = "Soft Croutons";
		}
		
		System.out.println();
		System.out.println();
		
		if(pizza == true) {
			System.out.println(initialReceipt);
			System.out.println(pizzaSize);
			System.out.println(pizzaTopping);
		}else if(wings = true) {
			System.out.println(initialReceipt);
			System.out.println(wing);
			System.out.println(bone);
		}else if(salad == true) {
			System.out.println(initialReceipt);
			System.out.println(dressing);
			System.out.println(crouton);
			//For some reason, salad always returns "null"
		}
		
		double totalCost = baseCost + pizzaSizeCost + pizzaToppingCost + wingsSauceCost + boneCost + dressingCost + croutonCost;
		System.out.println();
		System.out.println("Your total cost:  $" + totalCost);
		
	}
}
