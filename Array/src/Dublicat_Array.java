import java.util.Scanner;
import java.util.*;
public class Dublicat_Array {
public static void main(String args[]) {
	int i,j;
	int []a= {1,2,5,5,6,7,6,2};

	ArrayList<Integer> l=new ArrayList<Integer>();
	ArrayList<Integer> s=new ArrayList<Integer>();
	for(i=0;i<a.length;i++) {
		for(j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				l.add(a[i]);
			
				
			}
		}
	}
		for(i=0;i<l.size();i++) {
		
			for(j=0;j<a.length;j++) {
			
				if(l.get(i)==a[j]) {
					a[i]=a[j];
				}
				
				
			}
			
		
			
			
		}
	
	System.out.print(l);
	System.out.println("");
	System.out.print(s);
}
}
