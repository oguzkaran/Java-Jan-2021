/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyelinden büyük ilk Armstrong sayısını bulan
	programı yazınız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		FactorialTest.run();	
	}
}

class FactorialTest {
	public static void run() 
	{
		int n = 14;
		
		for (int i = -1; i <= n; ++i)
			System.out.printf("%d! = %d%n", i, NumberUtil.factorial(i));
	}
}

class NumberUtil {	
	public static int factorial(int n)
	{		
		int result = 1;
		
		for (; n >= 2; --n)
			result *= n;
		
		return result;
	}
}