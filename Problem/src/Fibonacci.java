import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		int l,a=-1,b=1,i,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Number of limit : ");
		l=input.nextInt();
		for(i=0;i<l;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
			
		}
		
		
	}

}
