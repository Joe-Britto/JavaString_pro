package Advance_Java;

import java.util.Scanner;

public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("program to count letters,numbers and special \n"
				+ "chracters in a password");
		String str="";
		int lc=0,uc=0,num=0,spchar=0;
		char ch;
		System.out.println("Enter a password");
		str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			   ch = str.charAt(i);
			if (Character.isUpperCase(ch)==true)
				uc++;
			else if (Character.isLowerCase(ch)==true)
				lc++;
			else if (Character.isDigit(ch)==true)
				num++;
			else  spchar++;
		};
		
		System.out.println("UpperCase letters count is: "+uc);
		System.out.println("LowerCase letters count is: "+lc);
		System.out.println("Number Digit count is: "+num);
		System.out.println("Special Characters count is: "+spchar);

	}

}
