import java.util.Scanner;
import java.lang.*;
public class Nested_For {
public static void main(String args[]) {
	int i,j,n;
	System.out.println("number of row want to print : ");
	Scanner number=new Scanner(System.in);
	n=number.nextInt();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
}
}
