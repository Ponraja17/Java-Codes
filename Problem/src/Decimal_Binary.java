import java.util.Scanner;
public class Decimal_Binary {
	public static void decimaltoBinary(int n) {
		int i=0,j;
		int rem[]=new int[1000];
		while(n>0) {
			rem[i]=n%2;
			n/=2;
			i++;
		}
		for(j=i-1;j>=0;j--) 
			System.out.print(rem[j]);
		
		
	}
public static void main(String args[]) {
	int n;
	Scanner input=new Scanner(System.in);
	System.out.print("enter the value you want to convert : ");
	n=input.nextInt();
	System.out.print("The binary value is : ");
	decimaltoBinary(n);
	
	
}
}
