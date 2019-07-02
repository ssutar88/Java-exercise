package github.java;

public class WrapperClass {
	public static void main(String[] args) {
		int i = 5;
		Integer ii = new Integer(i);  //Boxing
		Integer jj = i;               // Auto-boxing
		
		int j = ii.intValue();        // Unboxing
		int k = jj;                   // Auto-unboxing
		
		
	}

}
