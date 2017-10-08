package example.two.Implements.Runnable;

public class StartApp {

	public static void main(String[] args) {

		Thread test1 = new Thread(new Runner());
		Thread test2 = new Thread(new Runner());
		
		test1.start();
		test2.start();
	}

}
