package github.java;

public class Interface {
	public static void main(String[] args) {
		ABC obj = new ABCImplement();
		//obj.show();
		
		// Anonymous Inner class
		ABC obj1 = new ABC() {
			
			public void show() {
				System.out.println("Inner class");
			}
		};
		
		//obj1.show();
		
		// SAM -> Single abstract methods -> functional interface 
		
		ABC obj2 = () -> System.out.println("Inner class");
		obj2.show();
	}

}

// No method is defined
interface ABC {
	void show(); // public abstract
}

class ABCImplement implements ABC{

	public void show() {
		System.out.println("in show");
	}
	
	interface A{
		
	}
	interface B{
			
	}
	interface C extends A,B{  // Multiple Inheritance
		
	}
	
}