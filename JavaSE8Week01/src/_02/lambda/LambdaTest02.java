package _02.lambda;import java.lang.invoke.LambdaMetafactory;

public class LambdaTest02 {

	public static void main(String[] args) {
		Calculator lambda1 = (int x, int y) -> x + y; // metodun donus tipi int!
		// x+y ---> return x+y ye karsilik gelmektedir.

		// burada , parametre tipini vermek zorunda degiliz!!!
		// (int m , int n) yerine direkt olarak (m,n) verebiliriz!
		// parametre listesinde 1 tanesinin donus tipini yazarsak digerinin mutlaka yazilmasi gerekli.
		// (int m, n) LEGAL degildir , birtanesinin tipini berlirttiysek bu durumda digerlerini de belirtmemiz gereklidir.
		Calculator lambda2 = (m,n) -> m - n;
		
		
		// Calculator lambda3 = (m , n) -> return m*n; legal degildir!
		// return anahtar kelimesini kullandigimizda bu duurmda suslu parantez kullanmamiz gereklidir.
		Calculator lambda3 = (m , n) -> { 
		
			if(m == 10){
				System.out.println("test mesage!");
			}
			
			return m*n; 
			};
			
		System.out.println(lambda1.operation(10,20));
		System.out.println(lambda2.operation(10,20));
		System.out.println(lambda3.operation(10,20));

	}
}

@FunctionalInterface
interface Calculator {

	// 1 tane olmaz zorunda! , kendisinde ya da super interface
	int operation(int number1, int number2);

	// birden fazla abstract metodu olamaz, eger @FunctionalInterface ISE!
	// static ya da default method olabilir.
	// int operation2(int number1, int number2);
}