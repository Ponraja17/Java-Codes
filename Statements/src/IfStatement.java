import java.util.Scanner;
public class IfStatement {
public static void main(String args[]) {
	int a,b;
	System.out.println("Enter Two numbers : ");
	Scanner in = new Scanner(System.in);
	a=in.nextInt();
	if(a>=18) {
		System.out.println("you are eligible");
		}
	else {
		System.out.println("Not eligible");
	}
}
}
