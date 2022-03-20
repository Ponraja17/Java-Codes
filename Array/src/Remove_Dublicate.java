import java.util.Scanner;
import java.util.Arrays;
public class Remove_Dublicate {
public static void main(String args[]) {
	int l,i,j,count;
	int a[]= {1,3,1,3,5,5,6,6,8};
	Arrays.sort(a);
	l=a.length;
	for(i=0;i<l;i++) {
		count=0;
		for(j=i+1;j<l;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			
			
		}
		if(count==0) {
			System.out.println(a[i]+" ");
			
		}
		
	}
	
	
	
}
}

