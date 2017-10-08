package example.one.Extends.Thread;

public class Runner extends Thread {
	
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
}
