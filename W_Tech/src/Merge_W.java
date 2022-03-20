import java.util.Scanner;
import java.util.Arrays;
public class Merge_W {
	public static void main(String args[]) {
		int i,l,j=0;
		int a[]= {1,3,3,5};
		int b[]= {2,4,6,6};
		l=a.length+b.length;
		int [] c=new int[l];
		for(i=0;i<a.length;i++) {
			c[i]=a[i];
			
			
		}
		for(i=0;i<b.length;i++) {
			
			c[a.length+i]=b[i];
		}
		for(i=0;i<l;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("");
		Arrays.sort(c);
		for(i=0;i<l;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("");
		for(i=c.length-1;i>=0;i--) {
			System.out.print(c[i]+" ");
		}
		int [] temp=new int[c.length];
		System.out.println("");
		for(i=0;i<c.length-1;i++) {
			if(c[i]!=c[i+1]) {
				temp[j++]=c[i];
				
			}
		}
		temp[j++]=c[c.length-1];
		for(i=0;i<j;i++) {
			c[i]=temp[i];
		}
		for(i=0;i<j;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
