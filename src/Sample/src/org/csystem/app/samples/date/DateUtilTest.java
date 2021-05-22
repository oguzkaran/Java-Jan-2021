/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara göre
	haftanın hangi gününe geldiğini döndüren getDayOfWeek metodunu yazınız.
	Açıklamalar:
	- Metot geçersiz bir tarih için -1 değerine geri dönecektir
	- Haftanın günü 01.01.1900 ile verilen tarih arasındaki gün sayısının 7 değerine modu alınarak bulunabilir. Bu işlemden
	sonra elde edilen değer için 0(sıfır) Pazar, 1(bir) Pazartesi, ..., 6(altı) Cumartesi günleridir.
	-  01.01.1900'den önceki tarihler geçersiz kabul edilecektir
	(İleride daha iyi şekilde yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.samples.date;

import java.util.Scanner;

public class DateUtilTest {
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
			
			DateUtil.displayDateTR(day, month, year);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}