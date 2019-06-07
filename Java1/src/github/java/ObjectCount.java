package github.java;
import static java.lang.System.out;


public class ObjectCount {
	static int i;
	
	public ObjectCount() {
		// TODO Auto-generated constructor stub
		i++;
	}
	
	public void counter() {
		System.out.println("Obj count "+i);
	}
	
	public static void main(String[] args) {
		ObjectCount obj1= new ObjectCount();
		ObjectCount obj2= new ObjectCount();
		ObjectCount obj3= new ObjectCount();
		obj1.counter();
		
		// Static import
		out.println("value of s "+s);
	}
	
	// Static block to initialize static vars
	
	static String s = "";
	static {
		System.out.println("Static block executes before main");
		s = "";
	}	
	static {
		System.out.println("Static block 2 executes before main");
	}

}
