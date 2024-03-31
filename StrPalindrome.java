package Advance_Java;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Palindrome samples ; peep,wow,noon, rotator etc");
		String str = "" ,revstr ="";
		System.out.println("Enter a string/word for Palindrome");
		str = sc.nextLine();
		char ch;
		for (int i = str.length()-1; i >= 0; i--) {
			 ch= str.charAt(i);
			 revstr = revstr + ch;
			//System.out.print(ch);
		}
		if (str.equalsIgnoreCase(revstr)) {
			System.out.println("Its a Palindrome :"+revstr);
		}else {
			System.out.println("Its not a palindrome :"+revstr);
		}

	}

}
