import java.util.Scanner;
import java.lang.*;
public class Armstrong2 {
	public static void main(String args[]) {
		int d1,d2,d3,d,a;
		System.out.println("Enter the 3 digit number");
		Scanner input=new Scanner(System.in);
		d=input.nextInt();
		a=d;
		
		d1=d%10;
		d/=10;
		
		d2=d%10;
		d/=10;
		
		d3=d%10;
		 int result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
		 if(a==result) {
			 System.out.println("Its armstrong "+result);
		 }
		 else{
			 System.out.println("Not armstrong "+result);
		 }
		
	}

}
