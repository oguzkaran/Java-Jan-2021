/*----------------------------------------------------------------------------------------------------------------------
	StringUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Character.*;

public final class StringUtil {
	private static final String ALPHABET_LOWER_TR;
	private static final String ALPHABET_LOWER_EN;
	private static final String ALPHABET_ALL_TR;
	private static final String ALPHABET_ALL_EN;

	static {
		ALPHABET_LOWER_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
		ALPHABET_LOWER_EN = "abcdefghijklmnopqrstuvwxyz";
		ALPHABET_ALL_TR = ALPHABET_LOWER_TR + "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
		ALPHABET_ALL_EN = ALPHABET_LOWER_EN + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	}

	private StringUtil()
	{
	}

	public static String capitalize(String s)
	{		
		return s.isEmpty() ? s : toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}
	
	public static int countString(String s1, String s2)
	{
		int count = 0;
		
		for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++count, ++i)
			;
		
		return count;
	}

	public static void display(String [] s)
	{
		for (String str : s)
			System.out.println(str);
	}

	public static void fillRandomArrayTR(String [] s, int min, int max)
	{
		fillRandomArrayTR(new Random(), s, min, max);
	}

	public static void fillRandomArrayTR(Random r, String [] s, int min, int max)
	{
		for (int i = 0; i < s.length; ++i)
			s[i] = StringUtil.getRandomTextTR(r, r.nextInt(max - min) + min);
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

	public static String [] getRandomArrayTR(int n, int min, int max)
	{
		return getRandomArrayTR(new Random(), n, min, max);
	}

	public static String [] getRandomArrayTR(Random r, int n, int min, int max)
	{
		String [] s = new String[n];

		fillRandomArrayTR(r, s, min, max);

		return s;
	}

	public static String getRandomTextTR(Random r, int n)
	{
		return getRandomText(r, n, ALPHABET_ALL_TR);
	}
	
	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new Random(), n);
	}
	
	public static String getRandomTextEN(Random r, int n)
	{
		return getRandomText(r, n, ALPHABET_ALL_EN);
	}
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new Random(), n);
	}
	
	public static String getRandomText(Random r, int n, String sourceText)
	{
		char [] c = new char[n];
		
		for (int i = 0; i < n; ++i)
			c[i] = sourceText.charAt(r.nextInt(sourceText.length()));
					
		return String.valueOf(c);
	}

	public static int indexOf(String [] s, String str)
	{
		for (int i = 0; i < s.length; ++i)
			if (s[i].equals(str))
				return i;

		return -1;
	}

	public static int indexOfStartsWith(String [] s, String str)
	{
		for (int i = 0; i < s.length; ++i)
			if (s[i].startsWith(str))
				return i;

		return -1;
	}

	public static int indexOfEndsWith(String [] s, String str)
	{
		for (int i = 0; i < s.length; ++i)
			if (s[i].endsWith(str))
				return i;

		return -1;
	}

	public static boolean isPangramTR(String text)
	{
		return isPangram(text.toLowerCase(), ALPHABET_LOWER_TR);
	}
	
	public static boolean isPangramEN(String text)
	{
		return isPangram(text.toLowerCase(), ALPHABET_LOWER_EN);
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
			
			if (!isLetter(cLeft)) {
				++left;
				continue;
			}
			
			cLeft = Character.toLowerCase(cLeft);
			
			char cRight= s.charAt(right);
			
			if (!isLetter(cRight)) {
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

	public static String join(String [] s, char delimiter)
	{
		return join(s, delimiter + "");
	}

	public static String join(String [] s, String delimiter)
	{
		return join(s, 0, delimiter);
	}

	public static String join(String [] s, int startIndex, char delimiter)
	{
		return join(s, startIndex, delimiter + "");
	}

	public static String join(String [] s, int startIndex, String delimiter)
	{
		String str = "";

		for (int i = startIndex; i < s.length; ++i)
			str += s[i] + delimiter;

		return str.substring(0, str.length() - delimiter.length());
	}


	public static String join(ArrayList list, char delimiter)
	{
		return join(list, 0, delimiter + "");
	}

	public static String join(ArrayList list, String delimiter)
	{
		return join(list, 0, delimiter);
	}

	public static String join(ArrayList list, int startIndex, char delimiter)
	{
		return join(list, startIndex, delimiter + "");
	}

	public static String join(ArrayList list, int startIndex, String delimiter)
	{
		String str = "";

		int size = list.size();
		for (int i = startIndex; i < size; ++i)
			str += list.get(i) + delimiter;

		return str.substring(0, str.length() - delimiter.length());
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
		char [] c = new char[s.length()];
		int index = 0;
		int length = s.length();

		for (int i = 0; i < length; ++i) {
			char ch = s.charAt(i);

			if (!isWhitespace(ch))
				c[index++] = ch;
		}

		return String.valueOf(c, 0, index);
	}	

	public static String reverse(String s)
	{
		char [] c = s.toCharArray();

		ArrayUtil.reverse(c);

		return String.valueOf(c);
	}
	
	
	public static String trimLeading(String s)
	{
		int i;
		int length = s.length();
		
		for (i = 0; i < length && isWhitespace(s.charAt(i)); ++i)
			;
		
		return s.substring(i);		
	}
	
	public static String trimTrailing(String s)
	{
		int i;

		for (i = s.length() - 1; i >= 0 && isWhitespace(s.charAt(i)); --i)
			;		
		
		return s.substring(0, i + 1);
	}
}
