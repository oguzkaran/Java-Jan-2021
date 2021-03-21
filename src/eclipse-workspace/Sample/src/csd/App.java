/*----------------------------------------------------------------------------------------------------------------------
	break deyimi döngü deyimi ve switch deyimi dışında kullanılamaz 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		for (int i = 0; i < 10; ++i)
			Sample.foo(i);			
	}
}

class Sample {
	public static void foo(int i)
	{
		if (i < 0)
			break; //error
		
		System.out.printf("i = %d%n", i);		
	}
}
