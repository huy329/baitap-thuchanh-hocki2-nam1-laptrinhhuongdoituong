//Write a function that receive a character and check whether it is alphanumeric or not.

package one;

import java.util.*;
import java.lang.*;

public class seven {
	public static void kitu(char c) {
		if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
			System.out.println("Ki tu vua nhap la chu");
		} else if(c >= 0 || c < 0) {
			System.out.println("Ki tu vua nhap la so");
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap 1 ki tu: ");
		String d = sc.nextLine();
		char c = d.charAt(0);
		
		seven.kitu(c);
	}
}