import java.util.Scanner;
public class TwoDimension_Array {
	public static void main(String args[]) {
		int i,j;
		int a[][]= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
			
		}
		
		//from user input Declaration
		//int [][] a=new int[10][10];
		//int [][][] a=new int[10][10][10];
	}

}
