package github.java;

public class Binary {
	public static void main(String[] args) {
		
		// Binary to Decimal
		int i = 0B1000_000_000;
		System.out.println("Decimal "+ i);
		
		// Decimal to Binary
		
		StringBuffer s = new StringBuffer();
		//int j = 5;
		while(i > 0) {
			
			s.append(i%2);
			i = i/2;
		}
		System.out.println("Binary "+ s.reverse());
	}

}

