package github.java;

public class MutithreadingWithRunnable {
	
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {


			for(int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		
		});
		Thread t2 = new Thread(() -> {


			for(int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		
		});
		t1.start();
		t2.start();
	}

}


