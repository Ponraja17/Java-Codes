import java.util.Scanner;
public class Factoial {
	public static void main(String args[]) {
		int n,i,sum=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=input.nextInt();
		for(i=n;i>1;i--) {
			sum*=i;
		}
		System.out.println(n+"Factorial ! is : "+sum);
		
	}

}
