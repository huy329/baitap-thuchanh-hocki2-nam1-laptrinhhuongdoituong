//Write a function to check whether a number is even or odd.

package one;

import java.util.*;
import java.lang.*;

public class six {
	public static void chanle(int n) {
		if(n % 2 == 0) {
			System.out.println("So vua nhap la so chan");
		} else if(n % 2 != 0) {
			System.out.println("So vua nhap la so le");
		}		
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		chanle(n);
	}
}