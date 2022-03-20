import java.util.Scanner;
import java.lang.*;
public class Factorial {
public static void main(String args[]) {
	int f,i,temp=1;
	System.out.println("Which number you want to find factorial : ");
	Scanner number=new Scanner(System.in);
	f=number.nextInt();
	for(i=f;i>=1;i--) {
		temp*=i;
	}
	System.out.println("Factorial is : "+temp);
	
}
}
