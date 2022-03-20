import java.util.Scanner;
import java.util.Arrays;
public class Second_Highest {
	public static void main(String args[]) {
		int fl=0,sl=0,i;
		int a[]= {1,2,3,4,2,6,7,10,0,5,12};
		for(i=0;i<a.length;i++) {
			if(a[i]>fl) {
				sl=fl;
				fl=a[i];
			}
		}
		System.out.println(sl+" "+fl);
		
	}

}
