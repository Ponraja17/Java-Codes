import java.util.Scanner;
import java.lang.String;
public class String_Methods {
public static void main(String args[]) {
	String a="Pon Raja";
	String b="pon Raja";
	System.out.println("a : "+a);
	System.out.println(" b : "+b);
	System.out.println(" Hashcode a : "+a.hashCode());
	System.out.println("Hashcode b : "+b.hashCode());
	System.out.println("Equals : "+a.equals(b));
	System.out.println("Ignore cae : "+a.equalsIgnoreCase(b));
	System.out.println("To upper case : "+a.toUpperCase());
	System.out.println("To lower case : "+b.toLowerCase());
	System.out.println("length : "+a.length());
	System.out.println("char at : "+a.charAt(0));
	System.out.println("Replace : "+a.replace("Raja","King"));
	System.out.println("contain : "+a.contains("Raja"));
	System.out.println("Empty : "+a.isEmpty());
	System.out.println("Starts with : "+a.startsWith("Po"));
	System.out.println("Ends with : "+b.endsWith("ja"));
	System.out.println("SubString : "+a.substring(5));
	System.out.println("Substring target : "+a.substring(0,3));
	char []carray=a.toCharArray();
	for(char array:carray) {
		System.out.print(array);
		
	}
	String c=" Pon Raja ";
	System.out.println("  Length : "+c.length());
	System.out.println("Before trim : "+c);
	System.out.println("After trim : "+c.trim());
	System.out.println("Length after trim : "+c.trim().length());
}
}
