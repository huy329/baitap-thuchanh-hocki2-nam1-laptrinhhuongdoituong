//Write a program to compute the area of a rectangle with a height and base provided by user.
//(area = 1/2 × base × height)

package one;

import java.util.*;
import java.lang.*;

public class two {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		int b = sc.nextInt();
		System.out.print("Height: ");
		int h = sc.nextInt();
		
		int area;
		area = (1/2) * b * h;
		
		System.out.println("Area: " + area);
	}
}