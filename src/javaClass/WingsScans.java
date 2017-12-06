package javaClass;

import java.awt.*;
import java.util.Scanner;

public class WingsScans extends PizzaDeliveryAttempt2{
	
	public static void wingsSauceScan() {
		
		do {
			System.out.println("What sauce would you like? We have a mild, medium, and hot sauce");
			Scanner sauceInput = new Scanner(System.in);
			String sauce = sauceInput.nextLine();
				if(sauce.equalsIgnoreCase("mild")) {
					mildSauce = true;
					boneScan();
				}
				else if(sauce.equalsIgnoreCase("medium")) {
					mediumSauce = true;
					boneScan();
				}
				else if(sauce.equalsIgnoreCase("hot")) {
					hotSauce = true;
					boneScan();
				}
				else {
					System.out.println("That is not a sauce type");
					wingsSauceScan();
				}
		}
		while(mildSauce == false && mediumSauce == false && hotSauce == false);
	}
	public static void boneScan() {
		do {
			System.out.println("Would you like your wings to be boneless?");
			Scanner boneInput = new Scanner(System.in);
			String bone = boneInput.nextLine();
				if(bone.equalsIgnoreCase("yes")) {
					boneYes = true;
				}
				else if(bone.equalsIgnoreCase("no")) {
					boneNo = true;
				}
				else {
					System.out.println("Cmon its a yes or no question");
					boneScan();
				}
		}
		while(boneYes == false && boneNo == false);
	}

}
