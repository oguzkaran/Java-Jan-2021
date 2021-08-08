/*----------------------------------------------------------------------------------------------------------------------
	Polymorphism (Çok biçimlilik): Programlamaya Biyoloji'den aktarılmıştır. Biyolojideki çok biçimlilik,
	"Farklı doku ya da organların evrim süreci içerisinde temel işlevleri aynı kalmak koşuluyla, bu işlevi yerine
	getirme biçiminin değişebilmesidir" şeklinde tanımlanabilir. Örneğin görme davranışı (eylemi) birbirlerinden türemiş
	canlılar arasında farklılık gösterebilmektedir. Ancak görev "görmektir".

	Nesne yönelimli programlama tekniğinde aşağıda anlatılan çok biçimliliğe (ki bu da Biyoloji'den aktarılandır)
	"çalışma zamanı çok biçimliliği (runtime polymoprhism)" denir. Polymorphisim dendiğinde ilk akla "runtime polymophism"
	gelir. Diğer bir polymophism de "derleme zamanı çokbiçimliliği (compile time polymorphism)" olarak adlandırılır.
	Derleme zamanı çokbiçimliliği ileride ele alınacaktır.

	Çalışma zamanı çokbiçimliliği için çok fazla tanım ya da açıklama yapılabilse de genel olarak aşağıdaki 3(üç) tanıma
	indirgenebilir:
	1. Biyolojik tanım:
	2. Yazılım mühendisliği tanımı:
	3. Aşağı seviyeli tanım:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        B.setValues(10, 20);
        System.out.printf("B.x=%d%n", B.x);
        System.out.printf("A.x=%d%n", A.x);
    }
}

class B extends A {
    public static int x;

    public static void setValues(int a, int b)
    {
        x = a;
        A.x = b; //***
    }
    //...
}

class A {
    public static int x;
    //...
}

