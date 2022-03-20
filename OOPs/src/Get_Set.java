class addition {
	private int number1, number2;

	int getNumbers() {
		return number1;

	}

	int getNumber2() {
		return number2;

	}

	void setNumbers(int a, int b) {
		number1 = a;
		number2 = b;
	}

}

public class Get_Set {
	public static void main(String args[]) {
		addition obj1 = new addition();
		addition obj2 = new addition();
		obj1.setNumbers(5, 6);
		obj2.setNumbers(2, 3);

		System.out.println(obj1.getNumbers());
		System.out.println(obj1.getNumber2());
		System.out.println(obj2.getNumbers());
		System.out.println(obj2.getNumber2());

	}

}
