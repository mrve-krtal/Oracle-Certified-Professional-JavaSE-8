package _03.interface$.newfeatures;

interface Interface1 {
	public default void defaultTestMethod() {
		System.out.println("Interface1#defaultTestMethod");
	}
}

interface Interface2 {
	public default void defaultTestMethod() {
		System.out.println("Interface2#defaultTestMethod");
	}
}

public class DiamondProblem implements Interface1 , Interface2{

	//DiamondProblem sinifi , Interface1 ve Interface2 yi implements etmekte.
	// bu interfacelerde ayni isimde metotlar tanimli (default)
	// bu durumda diamond problem ortaya cikmaktadir.
	// sinifta bu metodu override ETMEMIZ GEREKLIDIR!!
	@Override
	public void defaultTestMethod() {
		Interface1.super.defaultTestMethod(); //legaldir!
		//Interface2.super.defaultTestMethod();//
	}
	
	public static void main(String[] args) {
		Interface1 object1= new DiamondProblem();
		object1.defaultTestMethod();
		
		Interface2 object2= new DiamondProblem();
		object2.defaultTestMethod();
	}
}
