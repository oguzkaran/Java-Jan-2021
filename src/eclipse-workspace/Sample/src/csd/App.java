/*----------------------------------------------------------------------------------------------------------------------	
	String sınıfının compareToIgnoewCase metodu	 
	
	adana
	ankara ->
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{	
		CompareToTest.run();
	}
}

class CompareToTest {	
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
						
			System.out.println("-------------------------------");
			System.out.println(s1);			
			System.out.println(s2);
			System.out.println(s1.compareToIgnoreCase(s2));
			System.out.println("-------------------------------");		
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}	
}

