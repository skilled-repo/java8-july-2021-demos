package week2.day1.demo;


//Separate API
public interface IAudioPlayer {

	int x = 10; // static final variables - constants

	public void playAudio();

	// Default Method -> Non Abstract
	public default void touchSystem() { // cannot hold concrete method
		System.out.println("This is a Free Touch System");
	}

	// Static Methods - Non Abstract
	public static void hdDisplay() { // cannot hold concrete method
		System.out.println("This is a Free HDDisplay");
	}

}
