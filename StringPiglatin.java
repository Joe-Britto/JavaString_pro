package Advance_Java;

import java.util.Scanner;

public class StringPiglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Piglatin : from a single word , we choose from the first\n"
        		+ "vowel letter to the end of string and to this string add \n"
        		+ "letters which was there before the 1st vowel letter .in The\n"
        		+ "end just add 'ay' eg; java ->avajay");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single word in small letters");  
        String str="";
        str = sc.nextLine();
        char ch;
        int i;
        for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
        	if (ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				break;
			} 
			}
          //Note : int i should be declared outside of For loop coz 
        //accessed outside for loop
           String n = str.substring(i);//substring from 1st vowel onwards
           String m = str.substring(0,i);// substring before 1st vowel
           System.out.println(n+m+"ay"); // becomes Piglatin by adding ay
	}

}
