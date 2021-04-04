package logicalcode;

public class MagicBoxOddNumber {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		 int length =a.length;
		int m = 0;
		int n = length / 2;
		int b = 0;

		a[m][n] = b;
		for (int i = 0; i < length*length ; i++) {
			
			b++;
			a[m][n] = b;

			if (b % length == 0)
				m++;
			else {
				m--;
				n--;
			}

			if (m == -1)
				m =length-1 ;
			if (n == -1)
				n = length-1;
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(a[i][j] + "	");
			}
			System.out.println();
		}

	}

}
