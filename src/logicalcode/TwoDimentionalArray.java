package logicalcode;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int a[][]= new int[3][3];
		int m=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				m++;
				a[i][j]=m;
				
				System.out.print(a[i][j]+ "   ");
			}
			System.out.println();
			
		}
		
	
	}
	
}
