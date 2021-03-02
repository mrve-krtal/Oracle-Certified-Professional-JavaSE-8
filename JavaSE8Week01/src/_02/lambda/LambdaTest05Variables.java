package _02.lambda;

public class LambdaTest05Variables {

	int number ;
	
	public static void main(String[] args) {

		String localVariable = "injava";
		//localVariable ="compilererror";
		//local degiskene 2 kere , assigment yaptik bu durumda effectively final ozelligini kaybeder.
		//bu durumda lambda ifadesinde local degiskeni kullanamayiz!!
		// local degisken ya final olacak ya da effectively final olacak!
		
		//instance degiskenler icin bu kural gecerli degildir.
		LambdaTest05Variables object = new LambdaTest05Variables();
		object.number= 10;
		object.number= 20;
		
		LambdaMessage lambda1 = (String str) -> System.out.println(localVariable + str + object.number);
		lambda1.printMessage("wetrust");
	}
}

@FunctionalInterface
interface LambdaMessage {

	public void printMessage(String msg);

}