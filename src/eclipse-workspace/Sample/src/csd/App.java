/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olan metotlar geri dönüş değeri yokmuş gibi çağrılabilir. Yani bir meotdun geri dönüş değerinin
	bir işleme sokulması zorunluluğu yoktur. Şüphesiz metodun yaptığı işe göre bu anlamlı olabilir ya da olmayabilir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		Sample.foo();
	}
}

class Sample {
	public static int foo()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		short val = Short.parseShort(kb.nextLine());		
		int result = val * val;
		
		System.out.println(result);
		
		return result;													
	}
}


