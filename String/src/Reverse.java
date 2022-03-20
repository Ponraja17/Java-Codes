import java.util.*;
public class Reverse {
public static void main(String args[]) {
	String str="1 2 3";
	System.out.print(str);
	StringBuilder s=new StringBuilder(str);
	s.reverse();
	System.out.println();
	System.out.print(s.toString());
	System.out.println("");
	System.out.println(str.charAt(0));
	System.out.println("");
	char a[]=new char[str.length()];
	for(int i=s.length()-1;i>=0;i--) {
		a[i]=s.charAt(i);
	}
	System.out.print("");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	System.out.print("");
	for(int i=str.length()-1;i>=0;i--) {
		a[i]=str.charAt(i);
	}
	System.out.println("");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
}
}
