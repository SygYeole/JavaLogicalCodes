package logicalcode;

import java.util.Scanner;

public class GetSizeOfTwoDArray {
	public static void main(String[] args) {

 	Scanner sc= new Scanner(System.in);
	
 	System.out.println("Enter row dimention");
 	int a= sc.nextInt();
 	System.out.println("Enter colomn dimention");
 	int b= sc.nextInt();
		int m[][]= new int[a][b];
		
		System.out.println("row= "+m.length+" colomn= "+m[0].length );
	
		
	}

}
