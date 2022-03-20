import java.util.Scanner;
import java.lang.*;
public class Reverse_Digit {
	public static void main(String args[]) {
		int d,num,temp=0;
		System.out.println("Enter the digit : ");
		Scanner input=new Scanner(System.in);
		d=input.nextInt(); //d=123
		while(d!=0) {
			num=d%10; //3
			temp=(temp*10)+num;//3
			d/=10; //12
		}
		System.out.println("Reversed digit is "+temp);
		
	}

}
