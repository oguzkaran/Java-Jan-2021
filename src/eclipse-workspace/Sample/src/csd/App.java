/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamını döngü kullanmadan
	döndüren digitsSum metodunu yazınız. Metot basamak sayısı kontrolü yapmayacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("3 basamklı bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.printf("%d sayısının basamakları toplamı:%d%n", a, NumberUtil.digitsSum(a));			
	}
}

class NumberUtil {
	public static int digitsSum(int val)
	{		
		return Math.abs(val / 100 + val % 100 / 10 + val % 10);
	}
}
