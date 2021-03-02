package _02.lambda;

@FunctionalInterface
interface Animal {
	public void eat(String food);
}

@FunctionalInterface
// Animal interfacesinde tek bir tane abstract metot tanimli!
interface Dog extends Animal {
	
}

@FunctionalInterface
interface Cat extends Animal {
	@Override
	public void eat(String food);
}

//@FunctionalInterface
//LEGAL degildir,
// Bird interface inde fly metodu abstract
// Animal interface sini kalitmakta.
interface Bird extends Animal {
	public void fly();
}


public class FunctionalInterfaceTest {

}
