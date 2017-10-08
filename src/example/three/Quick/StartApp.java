package example.three.Quick;

public class StartApp {

	public static void exampleMethod() {
		Thread test1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		});
		
		test1.start();
	}
	
	public static void main(String[] args) {
		exampleMethod();
		exampleMethod();

	}

}

