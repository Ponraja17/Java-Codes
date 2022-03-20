import java.util.Scanner;
import java.lang.*;
public class Reverse_Digit {
	public static void main(String args[]) {
		int a,i,rem,temp=0;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the digit you want to reverse : ");
		a=input.nextInt();
		while(a!=0) {
			rem=a%10;
			temp=temp*10+(rem);
			a/=10;
			}
				System.out.println("reversed Digit is  : "+temp);
		
	}

}
