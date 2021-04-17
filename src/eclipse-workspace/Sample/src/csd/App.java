/*----------------------------------------------------------------------------------------------------------------------	
	 Aşağıdaki durumda doğrudan erişim olmadığından bir sorun oluşmaz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{	
		Sample s;
		
		
		s = Sample.foo(67);
		
		System.out.printf("s.x = %d%n", s.x);
	}
}


class Sample {
	public int x;
	
	public static Sample foo(int a)
	{
		Sample s = new Sample();
		
		s.x = a;
		
		return s;
	}
	
	public void bar(int a)
	{
		x = a;
	}
}