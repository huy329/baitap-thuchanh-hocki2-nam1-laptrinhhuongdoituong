//Write a function to count number of digits in a number.

package one;

import java.util.*;
import java.lang.*;

public class twelve {
	public static void count(int n) {
		int c = 0;
		for(; n >= 10; n = n / 10) {
			c += 1;
		}
		System.out.println("Count: " + c);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		twelve.count(n);
	}
}