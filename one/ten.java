//Write a function to calculate sum of digits and a function to calculate product of digits of a number.

package one;

import java.util.*;
import java.lang.*;

public class ten {
	public static void tong(int n) {
		int tong = 0;
		for(; n >= 10; n = n / 10) {
			n = n % 10;
			tong += n;
		}
		System.out.println("Tong: " + tong);
	}
	
	public static void tich(int n) {
		int tich = 1;
		for(; n >= 10; n = n / 10) {
			n = n % 10;
			tich *= n;
		}
		System.out.println("Tich: " + tich);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		ten.tong(n);
		ten.tich(n);
	}
}