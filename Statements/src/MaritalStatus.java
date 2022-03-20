import java.util.Scanner;
import java.lang.*;
public class MaritalStatus {
	public static void main(String args[]) {
		char a,b;
		int age;
		System.out.println("Enter M/U : ");
		Scanner input=new Scanner(System.in);
		a=input.next().charAt(0);
		if(a=='u' || a=='U') {
			
			System.out.println("Enter the gender M/F :");
			b=input.next().charAt(0);
			System.out.println("Age :");
			age=input.nextInt();
			if((b=='m' || b=='M') && age>30) {
				System.out.println("Eligible bro");
			}
			else if((b=='f'|| b=='F') &&age>30) {
				System.out.println("Eligible Sister");
			}
			else {
				System.out.println("Not Eligible");
			}
			
		}
		else if(a=='m' || a=='M'){
			System.out.println("Eligible");
		
	}
		else {
			System.out.println("invalid");
		}

}
}
