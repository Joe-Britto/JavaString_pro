package Advance_Java;

import java.util.Scanner;

public class Stringvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str ;
		int vow =0 , con=0 ,ws = 0;
		System.out.println("Enter a string");
		str = sc.nextLine();
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)== true) {
				if (ch =='a' ||ch =='e' ||ch =='i' ||ch =='o' ||ch =='u') {
					vow++;
				}else {
					con++;
				}
			}
			if (Character.isWhitespace(ch)== true) {
				ws++;
			}
		}
		System.out.println("No. of vowels is : "+vow);
		System.out.println("No. of consnants is : "+con);
		System.out.println("No. of White space is : "+ws);

	}

}
