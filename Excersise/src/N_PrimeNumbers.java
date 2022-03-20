import java.util.Scanner;
public class N_PrimeNumbers {
	public static void main(String args[]) {
		int l,i,count,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		l=input.nextInt();
		
		for(i=2;i<=l;i++) {
			count=0;
			
				for(j=1;j<=l;j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.print(i+" ");
				}
			
		}
		
	}

}
