package example.four.Synchronized;

public class StartApp {

	public int count = 0;
	
	public synchronized void incr() {
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		StartApp app = new StartApp();
		app.threadMethod();

	}
	
	public void threadMethod() throws InterruptedException {
		
		Thread test1 = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 50000; i++) {
					incr();
				}				
			}			
		});
		
		Thread test2 = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 50000; i++) {
					incr();
				}				
			}			
		});	
		
		test1.start();
		test2.start();
		
		test1.join();
		System.out.println("Cnt: " + count);
		System.out.println("Cnt: " + count);
		System.out.println("Cnt: " + count);
		test2.join();
		System.out.println("Cnt: " + count);
		System.out.println("Cnt: " + count);
		System.out.println("Cnt: " + count);
	}

}
