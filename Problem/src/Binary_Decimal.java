import java.util.Scanner;
public class Binary_Decimal {
	public static int Binary2D(int b) {
		int decimal=0,power=0,rem;
		while(b!=0) {
			rem=b%10;
			decimal+=rem*Math.pow(2,power);
			b/=10;
			power++;
			
		}
		
		return decimal;
	}
	public static void main(String args[]) {
		int b=1100;
		System.out.println("Decimal number is : "+Binary2D(b));
		
	}
	

}
