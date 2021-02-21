/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının logartimik işlem yapan metotları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = Double.parseDouble(kb.nextLine());		
				
		System.out.printf("log(%f) = %f%n", a, Math.log(a));	
		System.out.printf("log10(%f) = %f%n", a, Math.log10(a));
		System.out.printf("log1p(%f) = %f%n", a, Math.log1p(a));		
	}
}