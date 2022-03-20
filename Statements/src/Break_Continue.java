import java.util.Scanner;
import java.lang.*;
public class Break_Continue {
	public static void main(String args[]) {
		int i,l;
		System.out.println("Limit to print :");
		Scanner limit=new Scanner(System.in);
		l=limit.nextInt();
		for(i=1;i<=l;i++) {
			if(i==6) {
				continue;
			}
			System.out.println(+i);
			if(i==19) {
				break;
			}
		}
		
	}
}
