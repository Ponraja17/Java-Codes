import java.util.Scanner;
import java.util.*;
public class Insert_Array {
public static void main(String args[]) {
	int i,n,j;
	int a[]= {10,20,30,40,50};
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the index: ");
	i=input.nextInt();
	System.out.println("Enter the Number : ");
	n=input.nextInt();
	for(j=a.length-1;j>i;j--) {
		a[j]=a[j-1];
		
		
	
	}
	a[i]=n;
System.out.println("After insert : "+Arrays.toString(a));
	
	
}
}
