package org.csystem.app.samples.date;

public class DateUtil {
	public static int [] daysOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void displayDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		switch (dayOfWeek) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		case 6:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);
			break;
		}
		
		if (isWeekend(day, month, year))
			System.out.println("Kurs var. Tekrar yaptınız m??");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!!!");
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		return dayOfWeek == 0 || dayOfWeek == 6;		
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekend(day, month, year);
	}
	
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays = getDayOfYear(day, month, year);
		
		if (totalDays == -1 || year < 1900)
			return -1;
		
		for (int y = 1900; y < year; ++y)
			totalDays += isLeapYear(y) ? 366 : 365;		
		
		return totalDays % 7;
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;		
		
		return day + getTotalDays(month, year);		
	}
	
	public static int getTotalDays(int month, int year)
	{
		int totalDays = 0;

		for (int m = month - 1; m >= 1; --m )
			totalDays += daysOfMonths[m];

		return month > 2 && isLeapYear(year) ? totalDays + 1 : totalDays;
	}
	
	public static int getDays(int month, int year)
	{
		return month == 2 && isLeapYear(year) ? 29 : daysOfMonths[month];
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12)
			return false;		
		
		return day <= getDays(month, year);
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}