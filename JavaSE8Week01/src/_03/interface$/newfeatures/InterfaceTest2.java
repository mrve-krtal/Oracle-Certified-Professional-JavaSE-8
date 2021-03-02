package _03.interface$.newfeatures;

interface Fly {
	// abstract method
	public abstract int getWingSpan() throws Exception;

	public static final int MAX_SPEED = 100;

	public default void land() {
		System.out.println("Animal is landing");
	}
	
	public default void eat() {
		System.out.println("Animal is eating");
	}

	public static double calculateSpeed(float distance, double time) {
		return distance / time;
	}
}

class Eagle implements Fly {

	@Override
	public int getWingSpan() throws Exception {
		return 15;
	}
	
	//default metotlari override edebiliriz!
	@Override
	public void eat() {
		System.out.println("Eagle is eating");
	}


}

public class InterfaceTest2 {

	public static void main(String[] args) throws Exception {
		Fly flyEagle = new Eagle();
		System.out.println(flyEagle.getWingSpan());
		//
		
		flyEagle.land();
		//
		
		//flyEagle.calculateSpeed(10,5); //COMPILER ERROR bu sekilde calismaz!!!
		Fly.calculateSpeed(10, 5); // interface te tanimli static metotlari interfaceName.staticMethodName seklinde cagirabiliriz.
		// degisken uzerinden cagiramayiz legal degildi!
		
		flyEagle.eat();
		
	}
	
}
