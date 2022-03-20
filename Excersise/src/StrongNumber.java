import java.util.Scanner;
import java.lang.*;
public class StrongNumber {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int n,i,rem,result=0,f=1,c;
		n=input.nextInt();
		c=n;
		while(n!=0) {
			rem=n%10;
			for(i=1;i<=rem;i++){
				f*=i;
			}
			result+=f;
			f=1;
			n/=10;
		}
		if(c==result) {
			System.out.println(result+" its a strong number");
		}
		else {
			System.out.println(c+"!="+result+"  not strong");
		}
	}

}
