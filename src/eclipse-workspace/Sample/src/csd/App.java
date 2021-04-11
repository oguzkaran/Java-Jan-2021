/*----------------------------------------------------------------------------------------------------------------------	
	 Sınıfın static bir veri elemanına sınıf dışından referans ve nokta operatörü ile erişilebilir. Sınıf ismi ve
	 nokta ile erişmekten bir farkı yoktur. Referans ile static veri elemanına erişim okunabilirlik açısından kesinlikle
	 tercih edilmemelidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		Sample s = new Sample();
		System.out.printf("Sample.x = %d%n", Sample.x);
		System.out.printf("Sample.y = %b%n", Sample.y);
		
		s.x = 20;
		s.y = true;
		
		System.out.printf("Sample.x = %d%n", Sample.x);
		System.out.printf("Sample.y = %b%n", Sample.y);
	}
}

class Sample {
	public static int x;
	public static boolean y;
	//...
}
