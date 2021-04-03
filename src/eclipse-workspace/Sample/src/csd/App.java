/*----------------------------------------------------------------------------------------------------------------------	
	Homework-001-3. sorunun bir çözümü
	(Ödevin verildiği zamanda bilinen konular ile yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		SignumTest.run();	
	}
}

class SignumTest {
	public static void display(int a)
	{
		int result = NumberUtil.signum(a);
		
		if (result > 0)
			System.out.println("Pozitif");
		else if (result == 0)
			System.out.println("Sıfır");
		else
			System.out.println("Negatif");
	}
	
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in); 
		
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());		
		
		display(a);		
	}
}


class NumberUtil {
	public static int signum(int a)
	{
		if (a > 0)
			return 1;
		
		if (a == 0)
			return 0;
		
		return -1;
	}
}




