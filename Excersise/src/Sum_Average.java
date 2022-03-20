import java.util.Scanner;
import java.lang.*;
public class Sum_Average {
	public static void main(String args[]) {
		int n,i,sum=0,a;
		System.out.println("Enter the limits : ");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Enter" +i+"st Element");
			a=input.nextInt();
			sum+=a;
			}
		System.out.println("Sum of the elements is : "+sum);
		System.out.println("Average of element is : "+sum/n);
		
	}

}
