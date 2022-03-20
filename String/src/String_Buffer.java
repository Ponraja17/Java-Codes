import java.util.Scanner;



public class String_Buffer {

	public static void main(String args[]) {
		StringBuffer a=new StringBuffer("Raja");
		System.out.println(a);
		a.append(" b");
		System.out.println(a);
		a.delete(4,5);
		System.out.println(a);
		System.out.println(a.substring(1,4));
		System.out.println(a.substring(0));
		
		
		
	
	}

}
