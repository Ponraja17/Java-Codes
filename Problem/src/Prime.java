import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		int a,i,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		a=input.nextInt();
		for(i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
}

	if(count==2) {
		System.out.println(a+" is prime number");
	
	}
	else {
		System.out.println(a+" not a prime number");
	
		
	}
	}

}
