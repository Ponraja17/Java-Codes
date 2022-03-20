import java.util.Scanner;
import java.lang.*;
public class Odd_Even {
	public static void main(String args[]) {
		int l,e=0,o=0,a[],i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		l=input.nextInt();
		a=new int[l];
		
			for(i=0;i<l;i++) {
				
				a[i]=input.nextInt();
				
			}
			
			for(int Element:a) {
				if(Element%2==0) {
			e++;
		}
				else {
				o++;
			}
				
	}
			System.out.println("Even Numbers "+e);
			System.out.println("Odd numbers  "+ o);

}
}
