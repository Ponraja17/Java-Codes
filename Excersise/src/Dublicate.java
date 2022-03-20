import java.util.Scanner;
public class Dublicate {
	public static void main(String args[]) {
//		int []a=new int[5];
	int a[] = {1,2,3,2,3,5},i,j,count=0;
	
		Scanner input=new Scanner(System.in);
	
		for(i=0;i<5;i++) {
			for(j=i+1;j<=5;j++) {
				if(count==0) {
				if(a[i]==a[j]) {
					System.out.println("First dublicate is : "+a[i]);
					count++;
					
				}
				}
				
			}
			
		}

}
}