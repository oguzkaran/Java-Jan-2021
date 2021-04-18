/*----------------------------------------------------------------------------------------------------------------------	
	Java'da nesne yaratılması adımları:
	1. Bellekte yer ayrılır
	2. non-static (final olmayan) veri elemanlarına default değerler atanır
	3. Başlangıç metodu (constructor [ctor]) çağrılır
	
	Bu üç adımın sonunda new operatörünün ürettiği değer yani nesnenin adresi (referansı) elde edilmiş olur
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		Sample s;
		
		s = new Sample();
	}
}

class Sample {
	//...
}


