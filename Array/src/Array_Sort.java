import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Array_Sort {
public static void main(String args[]) {
	int i=0;
	int []a=new int[10];
	for(i=0;i<a.length;i++) {
		System.out.println("Enter the"+i+"Element : ");
		Scanner input=new Scanner(System.in);
		a[i]=input.nextInt();
		
		
	}
	System.out.print("Before sorting : "+Arrays.toString(a));
	Arrays.sort(a);
	System.out.print("Afte sorting : "+Arrays.toString(a));
	
}
}
