import java.util.Scanner;
import java.util.Arrays;
public class RemoveDublicate_Array {
	public static void main(String args[]) {
		int l,i,j=0;
		int a[]= {1,2,4,2,1,6,6,4};
		Arrays.sort(a);
		
		l=a.length;
		for(i=0;i<l-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		a[j++]=a[l-1];
		for(i=0;i<j;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
