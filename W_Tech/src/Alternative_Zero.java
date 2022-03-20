import java.util.Scanner;
import java.util.Arrays;
public class Alternative_Zero {
	public static void main(String args[]) {
		int a=12345,n,temp=0,k;
		while(a!=0) {
			n=a%10;
			temp=temp*10+(n);
			a/=10;
			
		}
		while(temp!=0) {
			k=temp%10;
			System.out.print(k+"0");
			temp/=10;
		}
	}

}
