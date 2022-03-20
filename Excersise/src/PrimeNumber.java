import java.util.Scanner;
import java.lang.*;
public class PrimeNumber {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		int n,i,result,flag=0;
		n=input.nextInt();
		
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				flag++;
			}
		}
		if(flag==2) {
			System.out.println(" prime");
			
		}
		else {
			System.out.println("not a prime");
		}
		}
		
		
		}
	


