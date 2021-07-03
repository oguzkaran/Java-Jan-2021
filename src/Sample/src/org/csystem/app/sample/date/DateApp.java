package org.csystem.app.sample.date;

import org.csystem.util.datetime.Date;

import java.util.Scanner;

public class DateApp {
	private static void displayDateTR(Date date)
	{
		System.out.println(date.toLongDateStringTR());

		if (date.isWeekend())
			System.out.println("Bugün Kurs var. Tekrar yaptınız mı?");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!!!");
	}

	private static  void displayDateEN(Date date)
	{
		System.out.println(date.toLongDateStringEN());

		if (date.isWeekend())
			System.out.println("Today is a course day. Did you review?");
		else
			System.out.println("Course day is comming. Do not forget to review!!!...");
	}

	public static void run()
	{
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Gün?");
			int day = Integer.parseInt(kb.nextLine());

			if (day == 0)
				break;

			System.out.print("Ay?");
			int month = Integer.parseInt(kb.nextLine());

			System.out.print("Yıl?");
			int year = Integer.parseInt(kb.nextLine());

			Date date = new Date(day, month, year);

			displayDateTR(date);
			displayDateEN(date);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}