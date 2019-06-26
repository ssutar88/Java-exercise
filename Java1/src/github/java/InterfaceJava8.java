package github.java;

public class InterfaceJava8 extends C implements I, J{
	
	public static void main(String[] args) {
		
		//Class's method remove will get called; class has a priority compared to interface (Third rule)
		InterfaceJava8 i = new InterfaceJava8();
		i.remove();
		
		// Static method in interface
		J.show();
	}	

}

interface I {
	//void show();
	default void remove() {
		System.out.println("Interface Remove");
	}
	
}

interface J {
	void remove();
	static void show() {
	}
	
	// can't override method from object class
	
	//	default boolean equals(Object o) {
	//		return false;
	//		
	//	}
	
}

class C implements I, J {

	// implements both interfaces and have confusion which to execute, then need to add own implementation
	@Override
	public void remove() {
		System.out.println("Class remove");
		
	}
	
	
	
}