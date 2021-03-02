package _02.lambda;

public class LambdaTest01 {

	public static void main(String[] args) {

		// public abstract void run();
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable#Anonymous run!");
				System.out.println("Runnable#Anonymous line");
			}
		};
		runnable.run();
		//

		//basta yer alan parantez , ifade -> fonksiyonel interface deki metodun parametre listesi.
		// run metodu parametre almiyor , bu durumda yine de () gerekli , aksi durumda derleme hatasi verecektir!
		Runnable runnableLambda = () -> System.out.println("Runnable#Lambda");
		runnableLambda.run();

		Runnable runnableLambda2 = () -> {
			System.out.println("Runnable#Lambda2 line1");
			System.out.println("Runnable#Lambda2 line2");
		};

		runnableLambda2.run();
		runnableLambda2.run();

	}
}

// @FunctionalInterface
// Lambda gramerini @FunctionalInterface ler ile kullanabiliriz.
// @FunctionalInterface ler 1 tane abstract metodu olan interfacelerdir.
