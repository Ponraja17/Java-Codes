import java.util.Scanner;
import java.lang.*;
public class Armstrong_100to999 {
public static void main(String args[]) {
	int i,a,a1,b,b1,c,result;
	for(i=100;i<=999;i++) {
		a=i%10;
		a1=i/10;
		b=a1%10;
		b1=a1/10;
		c=b1%10;
		result=(a*a*a)+(b*b*b)+(c*c*c);
		if(result==i) {
			System.out.println("armstrong numbers are : "+result);
		}
		
	}
}
}
