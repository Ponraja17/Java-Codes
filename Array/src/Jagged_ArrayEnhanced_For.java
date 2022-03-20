import java.util.Scanner;
import java.util.*;
public class Jagged_ArrayEnhanced_For {
	public static void main(String args[]) {
		int a[][]= {
				{10,20,30,40},
				{10,20,30},
				{10,20}
		};
		for(int k[]:a) {
			for(int l:k) {
				System.out.print(l+" ");
			}
			System.out.println("");
		}
		
	}

}
