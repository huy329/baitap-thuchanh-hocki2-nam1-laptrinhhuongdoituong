//Write a function to return the remainder of a division.

package one;

import java.util.*;
import java.lang.*;

public class eleven {
	public static int phandu(int n1, int n2) {
		int pd = n1 % n2;
		return pd;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap 2 so (giu khoang cach giua cac so): ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Phan du: " + eleven.phandu(n1, n2));
	}
}