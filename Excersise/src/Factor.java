import java.util.Scanner;
import java.lang.*;
public class Factor {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n,i;
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
