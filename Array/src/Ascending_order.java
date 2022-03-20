import java.util.Scanner;
import java.util.*;
public class Ascending_order {
	public static void main(String args[]) {
		int i,a[],l,j,temp=0;
		Scanner input=new Scanner(System.in);
		System.out.print("limit : ");
		l=input.nextInt();
		a=new int[l];
		for(i=0;i<a.length;i++) {
			a[i]=input.nextInt();
		}
		for(i=0;i<a.length;i++) {

			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
			System.out.print(Arrays.toString(a));
		
		
		
		
	}

}
