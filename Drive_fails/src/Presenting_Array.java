import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Presenting_Array {
	public static void main(String args[]) {
		int a[]= {1,2,5,4,7,6,1};
		int b[]= {1,2};
		List<Integer> sample=new ArrayList<Integer>();
		List<Integer> match=new ArrayList<Integer>();
	
		int i,j,l=0;
		
		
		for( i=0;i<a.length;i++)
		{
			
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
				match.add(a[i]);
				for(int k=i;k<a.length-1;k++)
				{
					a[k]=a[k+1];
				}

					
				}

				
				
				
				
			}
			
			
			

			
		}
		for( i=0;i<a.length-b.length;i++)
		{
			sample.add(a[i]);
		}
		Collections.sort(sample);
		for(int test:sample)
		{
			System.out.println(test);
		}
		for(int o=0;o<match.size();o++)
		{
			System.out.println("Matched List"+match.get(o));
		}
		match.addAll(sample);
		
			System.out.println(match);
		
		
		

		
		
	
		
	}

}
