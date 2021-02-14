/*----------------------------------------------------------------------------------------------------------------------
	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		int x;
		
		x = Sample.foo() * 2;
		
		System.out.println(x);		
	}
}

class Sample {
	public static int foo()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		int square = val * val;
		
		return square;
	}
}


