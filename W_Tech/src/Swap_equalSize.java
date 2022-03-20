import java.util.Scanner;
import java.util.Arrays;
public class Swap_equalSize {
	public static void main(String args[]) {
		int i;
		int a[]= {1,2,5};
		int b[]= {3,6,7};
		for(i=0;i<a.length;i++) {
			a[i]=a[i]+b[i];
			b[i]=a[i]-b[i];
			a[i]=Math.abs(a[i]-b[i]);
			
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		for(i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
			
		}
		System.out.println("");
		int temp=0,j;
		for(i=0;i<a.length-1;i++) {
			if(a[i]%2==0)
			{
				
				a[i]=b[i];
			}
			}
		
		for(i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
		System.out.println("");
		for(i=0;i<a.length-1;i++) {
			if(b[i]%2==0)
			{
				
				b[i]=a[i];
			}
			}
		
		for(i=0;i<a.length;i++) {
		System.out.print(b[i]+" ");
	}
		
	}

}
