/*----------------------------------------------------------------------------------------------------------------------
	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		IsPrimePerformanceTestApp.run();	
	}
}

class IsPrimePerformanceTestApp {	
	public static void run() 
	{
		int val = 1_000_003;
		
		System.out.println(NumberUtil.isPrime(val));
		System.out.println(NumberUtil.isPrimeSlow(val));
	}
}


class NumberUtil {	
	public static boolean isPrime(int val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
		
		int count = 0;
		
		for (int i = 11; i * i <= val; i += 2) {
			++count;
			if (val % i == 0)
				return false;
		}
		
		System.out.printf("isPrime:Count:%d%n", count);
		
		return true;
	}
	
	public static boolean isPrimeSlow(int val)
	{
		if (val <= 1)
			return false;
		
		int halfVal = val / 2;
		
		int count = 0;
		
		for (int i = 2; i <= halfVal; ++i) {
			++count;
			if (val % i == 0)
				return false;
		}		
		
		System.out.printf("isPrimeSlow:Count:%d%n", count);
		
		return true;
	}
}

