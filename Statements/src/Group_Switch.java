import java.util.Scanner;
import java.lang.*;
public class Group_Switch {
	public static void main(String args[]) {
		char a;
		System.out.println("Enter a charater to check vowels or not");
		Scanner ch=new Scanner(System.in);
		a=ch.next().charAt(0);
		switch(a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Character is vowel");
			break;
		default :
			System.out.println("Not a vowel");
		}
	}

}
