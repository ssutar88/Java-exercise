package github.java;

public abstract class Abstract {
	public static void main(String[] args) {
		// Can't instantiate abstract class
		// Mother obj = new Mother();
		
		Pranali p = new Pranali();
		p.cook();
		p.clean();
		p.decorate();
		
	}

}

abstract class Mother {
	// not compulsory to have abstract method in abstract class
public void cook() {
	System.out.println("Done cooking");
}
public abstract void clean();
public abstract void decorate();
}

abstract class Myself extends Mother{ 
	public void clean() {
		System.out.println("Done cleaning");
	}
	
}

 class Pranali extends Myself {       // Concrete class
	public void decorate() {
		System.out.println("Done decoartion");
	}
	
}