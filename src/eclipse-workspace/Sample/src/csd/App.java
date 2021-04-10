/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf türünden bellekte ayrılan bölgelere nesne (object) denir. Nesne ilgili sınıf türünden bir örnek olduğundan 
	"instance" terimi de kullanılır. Java'da referans bildirimi nesnenin yaratıldığı anlamına gelmez. Nesneler 
	stack'de yaratılmaz. Heap' de yaratılır. Nesne yaratılması new operatörü yapılır (şüphesiz akış new operatörüne
	geldiğinde nesne yaratılacak kod üretilir.) new operatörü tek operandlı, önek durumunda bir operatördür. Ürettiği
	değer heap'de yaratılan nesnenin adresidir(referansıdır.) new operatörünün genel biçimi:
	
		new <referans tür ismi>([argümanlar]);
	Bir nesnenin adresi bir referansa atandığında artık o "referans ilgili nesneyi gösterir" duruma gelir.  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{
		Sample s; 
		Mample m;
		
		
		s = new Sample();
		m = new Mample();
		//...									
	}
}

class Sample {
	//...
}

class Mample {
	//...
}