package week2.day1.demo;

public interface i1 {

	public void shape();
	
	public default void taste() {
		System.out.println("Soar");
	}
}
