package Advance_Java;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NOTE: In java , string literals are immutable\n"
				+ "However, it can be mutable by explict assignment ");
		
		String s = "java programs";
		s.concat(" DSA");
		System.out.println("String literals is immutable in java : "+s);
		System.out.println("String can be mutable by explicit Assignment");
		s= s.concat(" DSA");
		System.out.println("s= s.concat(\"DSA\"): "+s);
		

	}

}
