import java.util.Scanner;
public class Website {
	int webAge;
	String webName;
	float revenue;
	
	Website(String name,int age,float income){
		this.webName=name;
		this.webAge=age;
		this.revenue=income;
		
	}
	public static void main(String args[]) {
		float revenue=5000.55f;
		Website obj1=new Website("Googlebook",5,revenue);
		Website obj2=new Website("Facebook",4,0);
		
		System.out.println(obj1.webName+" "+obj1.webAge+" "+obj1.revenue);
		System.out.println(obj2.webName+" "+obj2.webAge);
		
	}

}
