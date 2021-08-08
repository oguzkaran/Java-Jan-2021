/*----------------------------------------------------------------------------------------------------------------------
	NumberUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import static java.lang.Math.*;

public final class NumberUtil {
	private static final String [] ONES;
	private static final String [] TENS;

	static {
		ONES = new String[] {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
		TENS = new String[]{"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
	}

	private static int [] getDigits(long val, int p)
	{
		val = Math.abs(val);

		int [] digits = new int[val == 0 ? 1 : (int)(log10(val) / p) + 1];
		int powerOfTen = (int)pow(10, p);

		for (int i = digits.length - 1; i >= 0; digits[i--] = (int)(val % powerOfTen), val /= powerOfTen)
			;

		return digits;
	}

	private static String numberToText3DigitsTR(int val)
	{
		if (val == 0)
			return "sıfır";

		String text = val < 0 ? "eksi" : "";

		val = abs(val);
		int a = val / 100;
		int b = val / 10 % 10;
		int c = val % 10;

		if (a != 0) {
			if (a != 1)
				text += ONES[a];
			text += "yüz";
		}

		if (b != 0)
			text += TENS[b];

		if (c != 0)
			text += ONES[c];

		return text;
	}


	private NumberUtil()
	{
	}

	public static int getIndexOfPrime(int n)
	{
		int i = 1;
		int val = 2;

		for (;;) {
			if (val == n)
				return i;

			if (isPrime(val))
				++i;

			++val;
		}
	}

	public static int calculateDigitalRoot(int val)
	{
		int root = Math.abs(val);

		while (root > 9)
			root = digitsSum(root);

		return root;
	}

	public static int digitsCount(int val)
	{		
		return val == 0 ? 1 : (int)log10(abs(val)) + 1;
	}	
	
	public static int digitsSum(int val)
	{		
		int sum = 0;	
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
		
		return abs(sum);
	}

	public static long factorial(int n)
	{		
		long result = 1;
		
		for (; n >= 2; --n)
			result *= n;
		
		return result;
	}

	public static int [] getDigits(long val)
	{
		return getDigits(val, 1);
	}

	public static int [] getDigitsInTwos(long val)
	{
		return getDigits(val, 2);
	}

	public static int [] getDigitsInThrees(long val)
	{
		return getDigits(val, 3);
	}

	public static int getDigitsPowSum(int val)
	{
		int n = digitsCount(val);
		int sum = 0;
		
		while (val != 0) {
			sum += pow(val % 10, n);
			val /= 10;
		}
		
		return sum;
	}

	public static int getDigitsFactorialSum(int n)
	{
		int sum = 0;

		while (n != 0) {
			sum += factorial(n % 10);
			n /= 10;
		}

		return sum;
	}

	public static int getNextArmstrongNumber(int val)
	{
		int i;
		
		for (i = val + 1; !isArmstrong(i); ++i)
			;
		
		return i;
	}

	public static int getNextFibonacciNumber(int val)
	{		
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, result;
		
		for (;;) {
			result = prev1 + prev2;
			
			if (result > val)
				return result;
			
			prev2 = prev1;
			prev1 = result;
		}
	}	

	public static int getPrime(int n)
	{		
		int count = 0;		
		int val = 2;
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;
		}		
	}

	public static boolean isArmstrong(int val)
	{
		return val >= 0 && getDigitsPowSum(val) == val;
	}

	public static boolean isDecimalHarshad(int val)
	{
		return val > 0 && val % digitsSum(val) == 0;
	}

	public static boolean isEven(int val)
	{
		return val % 2 == 0;	
	}

	public static boolean isFactorian(int n)
	{
		return n > 0 && getDigitsFactorialSum(n) == n;
	}

	public static boolean isHardyRamanujan(int val)
	{
		if (val <= 0)
			return false;

		int count = 0;

		for  (int x = 1; x * x * x < val; ++x)
			for (int y = x + 1; x * x * x + y * y * y <= val; ++y)
				if (x * x * x + y * y * y == val) {
					++count;
					++x;
				}

		return count >= 2;
	}


	public static boolean isOdd(int val)
	{
		return !isEven(val);
	}

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
		
		int sqrtVal = (int)sqrt(val);
		
		for (int i = 11; i <= sqrtVal; i += 2)			
			if (val % i == 0)
				return false;	
		
		return true;
	}

	public static boolean isPrimeX(int val)
	{
		int sum = val;
		boolean result;

		while ((result = isPrime(sum)) && sum > 9)
			sum = digitsSum(sum);

		return result;
	}

	public static boolean isSuperPrime(int val)
	{
		return isPrime(val) && isPrime(getIndexOfPrime(val));
	}

	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}

	public static String numberToText(long val)
	{
		String text = val < 0 ? "eksi" : "";

		int [] a = getDigitsInThrees(val);

		//TODO:
		for (int value : a)
			text += numberToText3DigitsTR(value) + "??";

		return text;
	}

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
