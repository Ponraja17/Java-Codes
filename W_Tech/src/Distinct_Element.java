import java.util.Scanner;
import java.util.Arrays;
public class Distinct_Element {
	public static void main(String args[]) {
		int i,j,count;
		int a[]= {7,9,1,3,4,5,6,3,6};
	
		for(i=0;i<a.length;i++) {
			count=0;
			for(j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			
		
		}
			if(count==1)	
				System.out.print(a[i]+" ");
		}
	
		System.out.println("");
		int b[]= {7,9,1,3,4,5,6,3,6};
		Arrays.sort(b);
		
		for(i=0;i<a.length;i++) {
			count=0;
			for(j=0;j<b.length;j++) {
			if(b[i]==b[j]) {
				count++;
			}
			
		
		}
			if(count==1)	
				System.out.print(b[i]+" ");
		}
	
		System.out.println("");
		
		for(i=0;i<a.length;i++) {
			count=0;
			for(j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			
		
		}
			if(count==1) {	
				System.out.print(a[i]+" ");
		}
		else {
			System.out.print(" * ");
		}
		
		}
		System.out.println("");
		for(i=0;i<a.length;i++) {
			count=0;
			for(j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			
		
		}
			if(count==1) {	
				System.out.print(" * ");
		}
		else {
			System.out.print(a[i]+" ");
		}
		
		}
		
	}

}

