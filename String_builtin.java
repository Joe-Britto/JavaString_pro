package Advance_Java;

public class String_builtin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="javalanguage";
		String str2 ="java programs";
		String str3 ="JAVA Programs";
		System.out.println("String variable var contains value: "+str);
		System.out.println("Char at 4th position in var :  "+str.charAt(4));
		System.out.println("lenght of string :"+str.length());
        System.out.println("substring(2) is : "+str.substring(2));
        System.out.println("substring(2,4) is : "+str.substring(2,4));
        System.out.println("contains(\"age\") is : "+str.contains("age"));
        System.out.println("contains(\"hello\") is : "+str.contains("hello"));
        System.out.println(" is str.equals(str2): "+str.equals(str2) );
        System.out.println(" is str2.equalsIgnoreCase(str3): "+str2.equalsIgnoreCase(str3));
        
        int value = 30;
        String svar = String.valueOf(value); // converts int to string value
        System.out.println("svar + 10 is : "+(svar+10)); //string concatenates
        
        
	}

}
