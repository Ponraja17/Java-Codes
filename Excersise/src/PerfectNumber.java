import java.util.Scanner;
import java.lang.*;
public class PerfectNumber {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the numbr : ");
		int a,i,sum=0;
		a=input.nextInt();
		for(i=1;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		if(a==sum) {
			System.out.println(a+"  Its a perfect number");
		}
		else {
			System.out.println(a+"  not a perfect number");
		}
	}

}
