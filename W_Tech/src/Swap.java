import java.util.Scanner;
import java.util.Arrays;
public class Swap {
	public static void main(String args[]) {
		int last,n,sum=0,i;
		int a=12345;
		last=a%10;
		 n=a/10;
		 for(i=1;n>10;n/=10,last*=10,i*=10) {
			 sum+=i*(n%10);
		 }
		 System.out.print((10*(last+sum)+n));
		 
		 
	}

}
