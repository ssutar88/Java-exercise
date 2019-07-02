package github.java;

public class MarkerInterface {
	
	public static void main(String[] args) {
		Demo obj =  new Demo();
		if(obj instanceof Marker) {
			obj.show();
		}else {
			System.out.println("No permission");
		}
	}

}

class Demo implements Marker{
	void show() {
		System.out.println("Marker Interface");
	}
}

interface Marker {
	
}

// serializable and remote interface
