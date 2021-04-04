package logicalcode;

public class Incre {
	static int a = 0;

	public static void main(String[] args) {
		a++;
		if (a > 5) {
			a--;
			m1();
		}
		System.out.println(a);
		main(null);
	}

	static void m1() {
		a--;
		if (a < 1)
			System.exit(0);
		System.out.println(a);
		m1();

	}

}
