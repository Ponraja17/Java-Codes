import java.util.Scanner;
public class ArmStrong {
public static void main(String arg[]) {
	int a,i,rem,temp=0,checker;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number  you want to check : ");
	a=input.nextInt();
	checker=a;
	while(a!=0) {
		rem=a%10;
		temp+=rem*rem*rem;
		a/=10;
	}
	if(checker==temp) {
		System.out.println(temp+" it is a armStrong number ");
	}
	else {
		System.out.println(temp+" its not a armstrong number");
	}
	
}
}
