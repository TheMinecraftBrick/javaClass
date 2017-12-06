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
	
	static boolean boneYes = false;
	static boolean boneNo = false;
	
	

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
}
