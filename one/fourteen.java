//Write a function to reverse the input integer number.

package one;

import java.util.*;
import java.lang.*;

public class fourteen {
	public static int palindrome(int n) {
		int pd, kq = 0;
		for(; n >= 10; n = n / 10) {
			pd = n % 10;
			kq = (kq * 10) + pd;
		}
		return kq;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		if(n == fourteen.palindrome(n)) {
			System.out.println("So vua nhap la so Palindrome");
		} else {
			System.out.println("So vua nhap khong phai la so Palindrome");
		}
	}
}