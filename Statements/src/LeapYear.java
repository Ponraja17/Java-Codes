import java.util.Scanner;
import java.lang.*;
public class LeapYear {
	public static void main(String args[]) {
		int year;
		System.out.println("Enter the year to check : ");
		Scanner yr= new Scanner(System.in);
		year=yr.nextInt();
		
		if(year%4==0 || (year%100==0 && year%400==0)) {
			System.out.println(+year+ " is Not leap bro");
		}
		else {
			System.out.println("Leap bro");
			
		}
	}

}
