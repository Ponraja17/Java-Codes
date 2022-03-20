class rectangle{
	int length,width;
	void getdetails(int a, int b) {
		this.length=a;
		this.width=b;
	}
	int area(){
		int a=length*width;
		
		return a;
		
	}
}
public class Class_Object {
public static void main(String args[]) {
     rectangle obj1=new rectangle();
   obj1.length=10;
   obj1.width=20;
   System.out.println(obj1.length);
   obj1.area();
   System.out.println(obj1.area());
   rectangle obj2=new rectangle();
   obj2.getdetails(5,6);
   System.out.println(obj2.area());
   
     
}
}
