//Write a function to reverse the input integer number.

package one;

import java.util.*;
import java.lang.*;

public class thirteen {
	public static void re(int n) {
		int c = 0;
		for(; n >= 10; n = n / 10) {
			System.out.println(n % 10);
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		thirteen.re(n);
	}
}