package logicalcode;

public class ArithmaticOperation {

	int num1;
	int num2;

	public ArithmaticOperation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void sum() {

		int c = num1 + num2;
		System.out.println(c);
	}

	public void sub() {

		int c = num1 - num2;
		System.out.println(c);
	}

	public void mul() {

		int c = num1 * num2;
		System.out.println(c);
	}

	public void div() {

		int c = num1 / num2;
		System.out.println(c);
	}
}
