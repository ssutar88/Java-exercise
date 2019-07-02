package github.java;

public class Cloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ABCD obj = new ABCD();
		obj.i = 2;
		obj.j = 5;
		ABCD obj1 = (ABCD) obj.clone();
		obj1.j = 9;
		System.out.println(obj);
		System.out.println(obj1);
	}

}

// implement cloneable marker interface to be allowed to clone objects
class ABCD implements Cloneable{
	int i,j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	// overriding clone method of object class
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
		
}