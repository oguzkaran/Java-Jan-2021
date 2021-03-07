/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki koşullar ayrık olmadığından örnek için else-if yazımı programlama hatasıdır 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());		
		
		if (val > 10)
			System.out.println("val > 10");
		if (val > 20)
			System.out.println("val > 20");		
				
		System.out.println("Tekrar yapıyor musunuz?");
	}
}



