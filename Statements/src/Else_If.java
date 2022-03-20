import java.util.Scanner;
import java.lang.*;
public class Else_If {
	public static void main(String args[]) {
		float avg;
		int i,n;
		System.out.println("Enter number of check : ");
		Scanner N=new Scanner(System.in);
		n=N.nextInt();
		
		for(i=1;i<=n;i++) {
			System.out.println("Enter average mark"+i+": ");
			Scanner average=new Scanner(System.in);
			avg=average.nextFloat();
		if(avg>=90 && avg<=100) {
			System.out.println("Grade A");
		}
		else if(avg>=80 && avg<=89) {
			System.out.println("Grade B");
			
		}
		else if(avg>=70 && avg<=79) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail da thambi");
		}
	}
	}

}
