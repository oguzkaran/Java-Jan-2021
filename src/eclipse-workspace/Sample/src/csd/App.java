/*----------------------------------------------------------------------------------------------------------------------
 	Mantıksal AND ve OR operatörleri doğru sonuca yani kağıt üzerinde yapılacak olsa elde edilecek sonuca en kısa 
 	yoldan ulaşabilmek için (kısa devre davranışını kullanarak) en soldaki ifadeyi önce yaparlar. Yani derleyici 
 	bu şekilde kod üretir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		boolean result;
		
		result = Sample.tar() && Sample.bar() || Sample.foo();		
			
		System.out.println(result);		
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}