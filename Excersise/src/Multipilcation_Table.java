import java.util.Scanner;
import java.lang.*;
public class Multipilcation_Table {//vaipaduu
	public static void main(String args[]) {
		int t,r,i;
		Scanner input=new Scanner(System.in);
		System.out.println("which table :");
		t=input.nextInt();
		System.out.println("How many rows : ");
		r=input.nextInt();
		for(i=1;i<=r;i++) {
			System.out.println(t+" x "+i+ " "+(i*t));
		}
		
	}

}
