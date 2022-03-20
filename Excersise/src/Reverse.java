import java.util.Scanner;
import java.util.Arrays;
public class Reverse {
	public static void main(String args[]) {
		int i;
		int a[]= {1,2,3,5,7,4,0};
		Arrays.sort(a);
		for(i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+"");
		}
	
	}

}
