package _02.lambda;

public class LambdaTest03 {

	public static void main(String[] args) {
		Message lambda1 = (String str) -> System.out.println(str);
		Message lambda2 = (str) -> System.out.println(str);
		
		//metot sadece bir tane parametre aliyorsa ve parametre tipini belirtmediysek
		//bu durumda parantez kullanmasak da olur.
		
		// legal degil parametre tipini belirttik parantez GEREKLI.
		//Message lambda3 =  String str -> System.out.println(str);
		
		Message lambda3 =  str -> System.out.println(str);
		//lambda gramerini fonksiyonel interfacelerle kullanabiliriz.
		
		lambda1.printMessage("message1");
		lambda2.printMessage("message2");
		lambda3.printMessage("message3");
	}
}

@FunctionalInterface
interface Message {
	public void printMessage(String msg);
}