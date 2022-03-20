import java.util.Scanner;
import java.lang.*;
public class While_loop {
public static void main(String args[]) {
	int a,i=1;
	System.out.println("Enter Run count");
	Scanner no=new Scanner(System.in);
	a=no.nextInt();
	while(i<=a){
		System.out.println(+i);
		i++;
	}
	
}
}
