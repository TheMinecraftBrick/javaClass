package javaClass;

import java.awt.*;
import java.util.*;

public class SaladScans extends PizzaDeliveryAttempt2 {
	
	static boolean caesarDressing = false;
	static boolean frenchDressing = false;
	static boolean italianDressing = false;
	
	static boolean normalCroutons = false;
	static boolean spicyCroutons = false;
	static boolean softCroutons = false;
	
	public static void dressingScan() {
		
		do {
			System.out.println("What dressing would you like? We have Caesar, French, and Italian");
			Scanner dressingInput = new Scanner(System.in);
			String dressing = dressingInput.nextLine();
				if(dressing.equalsIgnoreCase("caesar")) {
					caesarDressing = true;
					croutonsScan();
				}
				else if(dressing.equalsIgnoreCase("french")) {
					frenchDressing = true;
					croutonsScan();
				}
				else if(dressing.equalsIgnoreCase("italian")) {
					italianDressing = true;
					croutonsScan();
				}
				else {
					System.out.println("Please choose a correct dressing");
					dressingScan();
				}
		}
		while(caesarDressing == false && frenchDressing == false && italianDressing == false);
	}
	
	public static void croutonsScan() {
		
		do {
			System.out.println("What type of croutons would you like? We have normal, spicy, and soft croutons");
			Scanner croutonsInput = new Scanner(System.in);
			String croutons = croutonsInput.nextLine();
				if(croutons.equalsIgnoreCase("normal")) {
					normalCroutons = true;
				}
				else if(croutons.equalsIgnoreCase("spicy")) {
					spicyCroutons = true;
				}
				else if(croutons.equalsIgnoreCase("soft")) {
					softCroutons = true;
				}
				else {
					System.out.println("That's not a crouton option");
					croutonsScan();
				}
		}
		while(normalCroutons == false && spicyCroutons == false && softCroutons == false);
	}
	
}
