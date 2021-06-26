/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Bir okulda Matematik sınavı ortak olarak yapılıyor olsun. Kaç şube olduğu olduğu ve herbir şubede
    kaç öğrenci olduğu bilgisi klavyeden alınacaktır. Bu işlem sonrasında öğrencilerin notları rasgele belirlenecektir.
    Tüm bu işlemlerden sonra Matematik sınavı için herbir şubenin ayrı ayrı not ortalamaları ile okulun ortalamasını bulan
    basit bir simülasyon programı yazınız

    Not: İlerde daha iyi şekilde yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.simulation.exam;

public class ExamSimulationApp {
    private ExamSimulationApp()
    {
    }

    public static void run()
    {
        ExamSimulation mathSimulation = new ExamSimulation("Matematik");
        ExamSimulation physicsSimulation = new ExamSimulation("Fizik");

        mathSimulation.run();
        physicsSimulation.run();

        mathSimulation.displayReport();
        physicsSimulation.displayReport();
    }
}
