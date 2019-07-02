package github.java;

public class UserDefinedException {
	public static void main(String[] args) {
		int k = 2;
		if(k < 10) {
			try {
				throw new MyException("Error");
			} catch (MyException e) {
				System.out.println(e);
			}
		}
	}

}

class MyException extends Exception{

	public MyException(String string) {
		//super(string);
	}
	
}
