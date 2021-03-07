//Write functions to calculate the below formulas with n is provided by user...

package one;

import java.util.*;
import java.lang.*;

public class eight {
	public static void calculate(int n) {
		double i, a = 0, b = 0, c = 0, d = 0, e = 1;
		for(i = 1; i <= n; i++) {
			a += i;
			b *= i;
			c = (double) (c + Math.pow(2,i));
			if(i % 2 == 0) {
				d += 1/i;
			}
			e = (double) (e * Math.pow(i,2));
		}
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N: ");
		int n = sc.nextInt();
		
		eight.calculate(n);
	}
}