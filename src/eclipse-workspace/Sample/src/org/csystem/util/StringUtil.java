/*----------------------------------------------------------------------------------------------------------------------
	StringUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import java.util.Random;

public class StringUtil {	
	public static String capitalize(String s)
	{		
		return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}
	
	public static int countString(String s1, String s2)
	{
		int count = 0;
		
		for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++count, ++i)
			;
		
		return count;
	}
	
	public static String getLongestPalindrome(String s)
	{
		String maxStr = "";
		
		int endIndex = s.length();
		
		while (endIndex != 0) {
			int beginIndex = 0;
			
			while (beginIndex != endIndex) {
				String str = s.substring(beginIndex++, endIndex);
				
				if (str.length() > 1 && isPalindrome(str) && str.length() > maxStr.length())
					maxStr = str;					
			}
		
			--endIndex;
		}
		
		
		return maxStr;
	}

	public static String getRandomTextTR(Random r, int n)
	{
		return getRandomText(r, n, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
	}
	
	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new Random(), n);
	}
	
	public static String getRandomTextEN(Random r, int n)
	{
		return getRandomText(r, n, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new Random(), n);
	}
	
	public static String getRandomText(Random r, int n, String sourceText)
	{
		String str = "";
		
		for (int i = 0; i < n; ++i)			
			str += sourceText.charAt(r.nextInt(sourceText.length()));
					
		return str;
	}
	public static boolean isPangramTR(String text)
	{
		return isPangram(text.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");		
	}
	
	public static boolean isPangramEN(String text)
	{
		return isPangram(text.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
	}
	
	public static boolean isPangram(String text, String alphabet)
	{
		int length = alphabet.length();
		
		for (int i = 0; i < length; ++i)
			if (text.indexOf(alphabet.charAt(i)) == -1)
				return false;
		
		return true;
	}
	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = s.charAt(left);
			
			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}
			
			cLeft = Character.toLowerCase(cLeft);
			
			char cRight= s.charAt(right);
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			cRight = Character.toLowerCase(cRight);
			
			if (cLeft != cRight)
				return false;			
			
			++left;
			--right;
		}
		
		return true;
	}
	
	public static String padLeading(String s, int length, char ch)
	{
		length -= s.length();
		
		return length <= 0 ? s : (ch + "").repeat(length) + s;				
	}
	
	public static String padLeading(String s, int length)
	{
		return padLeading(s, length, ' ');
	}
	
	public static String padTrailing(String s, int length, char ch)
	{
		length -= s.length();
		
		return length <= 0 ? s : s + (ch + "").repeat(length);
	}
	
	public static String padTrailing(String s, int length)
	{
		return padTrailing(s, length, ' ');
	}	
	
	public static String removeWhitespaces(String s)
	{
		String str = "";
		int length = s.length();		
		
		for (int i = 0; i < length; ++i) {
			char ch = s.charAt(i);
			
			if (!Character.isWhitespace(ch))
				str += ch;
		}
		
		return str;		
	}	

	public static String reverse(String s)
	{
		String str = "";
		
		for (int i = s.length() - 1; i >= 0; --i)
			str += s.charAt(i);
		
		return str;
	}
	
	
	public static String trimLeading(String s)
	{
		int i;
		int length = s.length();
		
		for (i = 0; i < length && Character.isWhitespace(s.charAt(i)); ++i)
			;
		
		return s.substring(i);		
	}
	
	public static String trimTrailing(String s)
	{
		int i;
		
		
		for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;		
		
		return s.substring(0, i + 1);
	}
	
}
