/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Klavyeden elma girilene kadar alınan yazıların arasında klavyeden girilen bir yazı (ayraç) olacak 
	şekilde birleştirilmiş bir String oluşturan programı yazınız
	Örneğin: ankara, istanbul, izmir, zonguldak girildiğinde
	ankara-istanbul-izmir-zonguldak
	yazısı elde edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{	
		ConcatWithHyphenApp.run();		
	}
}

class ConcatWithHyphenApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Ayracı giriniz:");
		String sep = kb.nextLine();		
		String str = "";
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if (s.trim().isEmpty())
				continue;
			
			if ("elma".equals(s))
				break;		
			
			str += s + sep;			
		}	
		
		str = str.substring(0, str.length() - sep.length());
		System.out.println(str);
	}
}