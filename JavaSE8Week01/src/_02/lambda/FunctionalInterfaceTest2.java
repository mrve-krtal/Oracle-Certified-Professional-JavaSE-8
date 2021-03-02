package _02.lambda;

public class FunctionalInterfaceTest2 {

}

@FunctionalInterface
interface Functional {
	
	//bu metot java.lang.Object sinifinda yer aldigi icin
	// abstract metot sayisini artirmaz.
	// yani FunctionalInterface icin gerekli olan sadece TEK bir tane abstract metot sartini bozmaz.
	// bunun bir etkisi olmaz!!!
	// her sinif icin IS-A java.lang.Object onermesi dogrudur.
	// fakat interfaceler sinif hiyerarsisinde yer almazlar.
	// bununla birlikte boyle bir ozel durum vardir.
	
	//	@Override
	//    public boolean equals(Object obj);
	
	public boolean equalsX(Object obj);
    
}