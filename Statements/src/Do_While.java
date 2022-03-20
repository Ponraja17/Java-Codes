import java.util.Scanner;
import java.lang.*;
public class Do_While {
	public static void main(String args[]) {
		int a,i=2;
		System.out.println("Enter the limit for printing even number");
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		do {
			System.out.println(+i);
			i+=2;
		}
		while(i<=a);
	}

}
