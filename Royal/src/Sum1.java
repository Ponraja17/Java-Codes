
public class Sum1 {
	public static void main(String args[]) {
		int []a= {1,4,5,56,10,35,25};
		int count=0,flag=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<a[i+1]) {
				flag++;
				break;

			}
			
			
		}
		if(flag==0) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
	}

}
