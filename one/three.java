//Write a function to convert the temperature from Fahrenheit to Celsius and a function to convert the temperature from Celsius to Fahrenheit.

package one;

import java.util.*;
import java.lang.*;

public class three {
	public static void c(int f) {
		int c;
		c = (f - 32) * (5/9);
		
		System.out.println("C: " + c);	
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("F: ");
		int f = sc.nextInt();
		
		three.c(f);
	}
}