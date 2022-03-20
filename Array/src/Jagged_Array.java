import java.util.Scanner;
import java.util.*;
public class Jagged_Array {
	public static void main(String args[]) {
		int i,j;
		int a[][]= {
				{10,20,30,40},
				{10,20,30},
				{10,20,30,40}
		};
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
