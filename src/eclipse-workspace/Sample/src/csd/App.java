/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden n değeri için n tane rasgele belirlenmiş Türkçe karakterlerden
	oluşan bir yazı döndüren getRandomTextTR ile  tane rasgele belirlenmiş İngilizce karakterlerden oluşan bir yazı 
	döndüren getRandomTextEN isimli metotları yazınız ve test ediniz 		
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{	
		GetRandomTextTest.run();
	}
}

class GetRandomTextTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.err.println("----------------------");
			System.out.println(StringUtil.getRandomTextTR(r, n));						
			System.out.println(StringUtil.getRandomTextEN(r, n));
			System.out.println("----------------------");
		}		
	}
}

class StringUtil {
	public static String getRandomTextTR(java.util.Random r, int n)
	{
		return getRandomText(r, n, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
	}
	
	public static String getRandomTextTR(int n)
	{		
		return getRandomTextTR(new java.util.Random(), n);
	}
	
	public static String getRandomTextEN(java.util.Random r, int n)
	{
		return getRandomText(r, n, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new java.util.Random(), n);
	}
	
	public static String getRandomText(java.util.Random r, int n, String sourceText)
	{
		String str = "";
		
		for (int i = 0; i < n; ++i)			
			str += sourceText.charAt(r.nextInt(sourceText.length()));
					
		return str;
	}
}


