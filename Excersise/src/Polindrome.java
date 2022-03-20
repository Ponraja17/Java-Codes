import java.util.Scanner;
import java.lang.*;
public class Polindrome {
public static void main(String args[]) {
	int n,rem,temp=0,result;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number to check : ");
	n=input.nextInt();
	result=n;
	while(n!=0) {
		rem=n%10;
		temp=temp*10+rem;
		n/=10;
		
	}
	if(result==temp && result>0) {
		System.out.println(temp+"its a polindrome");
	}
	else {
		System.out.println(temp+"its not a polindrome");
	}
}
}
