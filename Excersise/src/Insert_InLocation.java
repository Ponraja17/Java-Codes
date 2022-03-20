import java.util.Scanner;
import java.util.Arrays;
public class Insert_InLocation {
	public static void main(String args[]) {
		int n,i,v;
		int a[]= {1,2,3,4,5};
		Scanner input=new Scanner(System.in);
		System.out.println("enter the index : ");
		n=input.nextInt();
		System.out.println("Enter the value : ");
		v=input.nextInt();
		for(i=a.length-1;i>n;i--) {
			a[i]=a[i];
		}
		a[i]=v;
	
	for(i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
		
		
	}

}
