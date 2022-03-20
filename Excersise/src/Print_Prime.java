import java.util.Scanner;
import java.lang.*;
public class Print_Prime {
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("Limit : ");
	int l,i,j,n,flag=0;
	l=input.nextInt();
	
	for(i=1;i<=l;i++) {
		for(j=1;j<=i;j++) {
			if(i%j==0) {
				flag++;
			}
		}
	if(flag==2) {
		System.out.println(i);
		
	}
     flag=0;
	}
}
}
