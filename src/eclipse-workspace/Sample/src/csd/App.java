/*----------------------------------------------------------------------------------------------------------------------
	İşlem öncesi otomatik tür dönüşümü için derleyici geçici değişken yaratılacak kodu üretir. Yani bu dönüşümler
	geçici değişken yaratılarak yapılır. Derleyicinin aşağıdaki örnek için ürettiği kod yaklaşık şu şekilde yazılabilir:
	int temp1 = a;
	int temp2 = b;
	c = temp1 + temp2;
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args)
	{		
		short a = 10;
		char b = 'Z';		
		int c;
		
		c = a + b;
		
		System.out.printf("c = %d%n", c);
	}
}

