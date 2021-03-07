//Write a function to find the minimum between three numbers.

package one;

import java.util.*;
import java.lang.*;

public class five {
	public static void min(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		} else if(min > c) {
			min = c;
		}
		
		System.out.println("Min giua 3 so la: " + c);	
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap 3 so (giu khoang cach giua cac so): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		five.min(a, b, c);
	}
}