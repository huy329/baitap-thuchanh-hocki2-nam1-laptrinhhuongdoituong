//Write vending machine programs.
package one;

import java.util.*;
import java.lang.*;

public class fifteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, m1;

		do {
			System.out.println("----Menu----");
			System.out.println("1. Coca");
			System.out.println("2. Pepsi");
			System.out.println("3. Sprite");
			System.out.println("4. Snack");
			System.out.println("5. Shutdown Machine");
	       
			System.out.println("Please enter the number: ");
			
			int n = sc.nextInt();
			
			switch (n) {
				case 1: 
					System.out.println("The price of Coca is: 2$, please enter the amount of money: ");
					m = 2;
					m1 = sc.nextInt();
					break;
				case 2:
					System.out.println("The price of Pepsi is: 3$, please enter the amount of money: ");
					m = 3;
					m1 = sc.nextInt();
					break;
				case 3:
					System.out.println("The price of Sprite is: 4$, please enter the amount of money: ");
					m = 4;
					m1 = sc.nextInt();
					break;
				case 4:
					System.out.println("The price of Snack is: 5$, please enter the amount of money: ");
					m = 5;
					m1 = sc.nextInt();
					break;
				case 5:
					System.out.println("Machine is shutting down.");
					m = 6;
					m1 = sc.nextInt();
					break;
				default:
					m = -1;
					m1 = -2;
					System.out.println("Please enter the valid number.");
			}
 
			if(m1 < m) {
				System.out.println("Not money to buy this item. Please select again.");
			} else {
				System.out.println("Your charge is " + (m1 - m) + "$.");
			}
			
		} while (m1 < m);
	}
}
