import java.util.Scanner;
import java.util.Arrays;
public class Largest_Smallest {
	public static void main(String args[]) {
		int lar,small,i;
		int []a= {1,2,3,5,4,0,18};
		lar=a[0];
		for(i=0;i<a.length;i++) {
		if(a[0]<a[i]) {
			a[0]=a[i];
			lar=a[0];
			
		}
		if(a[1]>a[i]) {
			a[1]=a[i];
			small=a[1];
		}
		}
		System.out.println("Largest is L "+a[0]);
		System.out.println("Smallest is : "+a[1]);
		
		
		
	}

}
