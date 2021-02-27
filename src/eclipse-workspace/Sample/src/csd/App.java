/*----------------------------------------------------------------------------------------------------------------------
	 Gerçek sayı sabitlerinde tamsayı kısmının değeri sıfırsa noktadan önce sıfır yazılmayabilir. Aynı durum 
	 noktadan sonraki sıfır ise de geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{	
		double a = .2;
		double b = 2.;
		
		System.out.printf("a = %f%n", a);
		System.out.printf("b = %f%n", b);
	}
}