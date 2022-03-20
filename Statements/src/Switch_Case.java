import java.util.Scanner;
import java.lang.*;
public class Switch_Case {
public static void main(String args[]) {
	int a,b,c;
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("choose no to calculate");
	Scanner input=new Scanner(System.in);
	c=input.nextInt();
	System.out.println("Enter 2 number for calculation");
	a=input.nextInt();
	b=input.nextInt();
	switch(c) {
	case 1:
		c=a+b;
		System.out.println("Addition "+c);
		break;
	case 2:
		c=a-b;
		System.out.println("Substraction "+c);
		break;
	case 3:
		c=a*b;
		System.out.println("Multiplication "+c);
		break;
	default :{
		System.out.println("Enter a number from the options");
	}
	}
}
}
