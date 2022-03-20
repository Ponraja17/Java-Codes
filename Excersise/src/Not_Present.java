import java.util.Scanner;
import java.util.Arrays;
public class Not_Present {
public static void main(String args[]) {
	int i,j,count;
	int a[]= {1,2,3,4,5,8};
	int b[]= {2,3,4,0,1,6};
	for(i=0;i<a.length;i++) {
		count=0;
		for(j=0;j<a.length;j++) {
			if(a[i]==b[j]) {
				count++;
			}
		
		}
		if(count==0) {
			System.out.println("Missing element is : "+a[i]);
		}
	}
	
}
}
