package Advance_Java;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";  
		// created java string using string literals
		char ch[] = {'s','t','r','i','n','g'};  
		// created java string using array
		String s2  = new String(ch);// converted char array to string
		String s3  = new String("example");
		// created java string using new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
