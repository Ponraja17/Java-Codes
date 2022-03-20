import java.util.Scanner;
public class Alargest {
	public static void main(String args[])
	{
		int n,i;  
		Scanner s=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=s.nextInt();  
		//creates an array in the memory of length 10  
		int[] a = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		a[i]=s.nextInt();  
		}  
		int la=a[0];
		
		for(i=1;i<n;i++)
		{
			if(a[0]<a[i])
			{
				a[0]=a[i];
			}
		}
		System.out.println("largest element is :  "+a[0]);
	}
	

}
