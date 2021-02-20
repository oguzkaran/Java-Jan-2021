/*----------------------------------------------------------------------------------------------------------------------
	Java'da metot içerisinde metot bildirimi geçersizdir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		CalculateTotalApp.run();			
	}
}

class CalculateTotalApp {
	public static void run()
	{
		public static void foo() //error:
		{
			
		}
	}


