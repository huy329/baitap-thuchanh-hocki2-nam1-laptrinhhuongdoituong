//Write a function to check whether a year is a leap year or not.

package one;

import java.util.*;
import java.lang.*;

public class four {
	public static void year(int y) {
		if(y % 400 == 0 && y % 4 == 0 && y % 100 != 0) {
			System.out.println(y + " is a leap year");
		} else {
			System.out.println(y + " is not a leap year");
		}		
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year: ");
		int y = sc.nextInt();
		
		four.year(y);
	}
}