import java.util.Scanner;
import java.util.Arrays;
public class Highest_Frequency {
	public static void main(String args[]) {
	int l,i,j,count=0,temp=0;
	int maxCount=1,maxElement=0;
int a[]= {1,3,4,3,4,6,4};
l=a.length;

for(i=0;i<l;i++) {
	count=0;
	for(j=i+1;j<l;j++) {
	if(a[i]==a[j]) {
		count++;
		
	}
	
}
	if(count>maxCount) {
		
		maxElement=a[i];
		maxCount=count;
		
			
			}
}
System.out.println(maxElement);


}
}
