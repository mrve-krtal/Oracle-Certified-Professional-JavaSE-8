package _03.interface$.newfeatures;

class BaseClass {
	public void foo() {
		System.out.println("BaseClass's foo");
	}
}

interface BaseInterface {
	default public void foo() {
		System.out.println("BaseInterface's foo");
	}
}

public class DiamondProblem2 extends BaseClass implements BaseInterface {

	public static void main(String[] args) {

		// sinif ile interface metotlari cakistiginda , burada otomatik olarak
		// class win kurali uygulanir.!
		DiamondProblem2 diamond = new DiamondProblem2();
		diamond.foo();
	}
}
// No compiler error in this case: the compiler resolves to the definition in
// the class and the interface definition is ignored.