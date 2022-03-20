import java.util.Scanner;
import java.util.Arrays;
public class Delete_GivenElement {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int v,i,n,j;
		
		System.out.println("Number of element in array : ");
		n=input.nextInt();
		int []a=new int[n];
for(i=0;i<n;i++) {
			System.out.println("Enter the : "+i+" Element : ");
			a[i]=input.nextInt();
		}
		System.out.println("Enter the element you want to delete  : ");
		v=input.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==v) {
				   for(j=i; j<a.length-1; j++){
	                    a[j] = a[j+1];
	                }
	                 
			}
		}
		for(i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
