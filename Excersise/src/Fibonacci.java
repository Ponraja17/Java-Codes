import java.util.Scanner;
import java.lang.*;
public class Fibonacci {
	public static void main(String args[]) {
		int n,i,a=-1,b=1,c;
		System.out.println("Enter the limit : ");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		for(i=0;i<n;i++) {
			c=a+b;
			System.out.println(+c);
			a=b;
			b=c;
			
		}
		
	}

}
