package example.one.Extends.Thread;

public class StartApp {

	public static void main(String[] args) {

		System.out.println("_________1________");
		Runner test = new Runner();	
		test.start();
		
		System.out.println("_________2________");
		Runner test2 = new Runner();	
		test2.run();
		
		System.out.println("_________3________");
		Runner test3 = new Runner();	
		test3.run();			
	}

}
