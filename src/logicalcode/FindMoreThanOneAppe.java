package logicalcode;

public class FindMoreThanOneAppe {
	public static void main(String[] args) {
		String str = "helloo";
		//String str1 = str;

		int m = 0;

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			for (int j = i+1; j < str.length(); j++) {
				
				if (ch == str.charAt(j))
					m++;
			}
			
			if (m > 0) {
				System.out.println("More Than one count    "+ch);
				//str= str.replace(ch, ' ');
				}
			m = 0;
		}
	}

}
