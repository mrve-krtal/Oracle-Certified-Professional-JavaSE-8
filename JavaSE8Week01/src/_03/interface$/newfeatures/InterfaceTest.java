package _03.interface$.newfeatures;

interface MyInterface {
	//
	public void testMethod1();
	public void testMethod2();
	
	// default metotlari override ETMEK ZORUNDA DEGILIZ!!!
	public default void defaultMethod(){
		System.out.println("default Method!");
	}
	
	public static void staticMethod() {
		System.out.println("static method!");
	}
}

class Implemantation implements MyInterface {

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testMethod2() {
		// TODO Auto-generated method stub
		
	}

	
}


public class InterfaceTest {

}
