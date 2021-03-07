//Write a function to find the first digit and a function to find last digit of a number.

package one;

import java.util.*;
import java.lang.*;

public class nine {
	public static void first(int n) {
		for(; n >= 10; n = n / 10) {
		}
		System.out.println("First: " + n);
	}
	
	public static void last(int n) {
		n = n % 10;
		System.out.println("Last: " + n);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		nine.first(n);
		nine.last(n);
	}
}