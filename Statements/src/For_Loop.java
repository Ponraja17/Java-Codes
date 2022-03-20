import java.util.Scanner;
import java.lang.*;
public class For_Loop {
	public static void main(String args[]) {
		int a,i;

System.out.println("Enter limit to print  :");
Scanner limit=new Scanner(System.in);
a=limit.nextInt();
for(i=1;i<=a;i++) {
	System.out.println(+i);
}


}
}