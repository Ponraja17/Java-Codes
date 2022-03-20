import java.util.Scanner;
import java.lang.*;
public class Armstrong {
public static void main(String args[]) {
	int a,rem=0,b;
	System.out.println("Enter the number to check : ");
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=a;
	while(a!=0) {
		rem=a%10;
		rem+=rem*rem*rem;
	    a/=10;
	}
	if(b==rem){
		System.out.println("Given Number " +b+ "is a Armstron number ");
		
	}
	else {
		System.out.println(+b+"Its not a armstrong number");
	}
}
}
