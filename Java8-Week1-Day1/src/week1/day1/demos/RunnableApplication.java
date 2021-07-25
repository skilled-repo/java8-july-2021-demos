package week1.day1.demos;

class Music implements Runnable {
	@Override
	public void run() {

		System.out.println("Backstreet Boys Playing!...");

	}
}

public class RunnableApplication {

	public static void main(String args[]) {
		//Anonymous Class
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Westlife  Playing!...");				
			}
		};
		
		Runnable r1 = () ->  System.out.println("Celine Dion  Playing!...");
		
		//Thread t1 = new Thread(new Music());
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
