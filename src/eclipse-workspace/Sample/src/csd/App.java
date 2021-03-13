/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren reversed isimli metodu yazınız
	ve test ediniz. Örneğin sayı 123 ise metot 321 değerini döndürecektir
	
	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		ReversedTest.run();		
	}
}


class ReversedTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());			
			int sum = NumberUtil.reversed(val);
			
			System.out.printf("%d sayısının tersi:%d%n", val, sum);
			
			if (val == 0)
				return;
		}
	}
}

class NumberUtil {
	public static int reversed(int val)
	{	
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;		
	}
}


