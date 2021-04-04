package logicalcode;

public class Demo {

	public static void main(String[] args) {

		Empolyye e1 = new Empolyye("Lokesh", 101, 100000.00);
		Empolyye e2 = new Empolyye("Syg", 101, 100000.00);
		Empolyye e3 = new Empolyye("KD", 101, 100000.00);
		Empolyye e4 = new Empolyye("Bona", 101, 100000.00);
		Empolyye e5 = new Empolyye("Rajjo", 101, 100000.00);
		Empolyye e6 = new Empolyye("Chinu", 101, 100000.00);

		Empolyye[] empList = { e1, e2, e3, e4, e5, e6 };

		for (int i = 0; i < empList.length; i++) {
			System.out.println(empList[i]);
		}

	}
}
