import java.util.Scanner;
import java.util.*;
public class Hello {
 public static void main(String args[]) {
//	 assigning array value
	 int i,a[]= {10,20,30,40,50};
	 //a.length to find the length.
//	 print array value
	 for(i=0;i<a.length;i++) {
		 System.out.print(a[i]+" ");
	 }
//	 print array value using enhanced for loop
	 for(int element : a) {
		 System.out.println(element);
	 }
	 
	 
//	 Array Declaring
	// int b[];
//	Array allocating memory 
	// b=new int[10];
//	 both declaring and allocating
	int [] c=new int[10];
//	 getting input from user
	 for(i=0;i<10;i++) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter the number ");
		 c[i]=input.nextInt();
	 }
	 for(int element : c) {
		 System.out.println(element);
	 }
 }
}
