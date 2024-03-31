package Advance_Java;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String str = "";
		System.out.println("Enter a string for Reversing");
		str = sc.nextLine();
		char ch;
		for (int i = str.length()-1; i >= 0; i--) {
			 ch= str.charAt(i);
			System.out.print(ch);
		}

	}

}
