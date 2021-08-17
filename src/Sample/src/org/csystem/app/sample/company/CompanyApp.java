package org.csystem.app.sample.company;

public class CompanyApp {
    private static Manager getManager()
    {
        Manager m = new Manager();

        m.setCitizenId("12345678912");
        m.setName("Ayşe");
        m.setAddress("Mecidiyeköy");
        m.setSalary(40000);
        m.setDepartment("Software");

        return m;
    }

    private static Worker getWorker()
    {
        Worker w = new Worker();

        w.setCitizenId("12345678562");
        w.setName("Ali");
        w.setAddress("Şişli");
        w.setFeePerHour(150);
        w.setHourPerDay(6);

        return w;
    }

    private static SalesManager getSalesManager()
    {
        SalesManager sm = new SalesManager();

        sm.setCitizenId("12345675692");
        sm.setName("Veli");
        sm.setAddress("Mecidiyeköy");
        sm.setSalary(30000);
        sm.setDepartment("Software");
        sm.setExtra(2000);

        return sm;
    }

    private static ProjectWorker getProjectWorker()
    {
        ProjectWorker w = new ProjectWorker();

        w.setCitizenId("12345678562");
        w.setName("Ali");
        w.setAddress("Şişli");
        w.setFeePerHour(150);
        w.setHourPerDay(6);
        w.setProjectName("Whatsapp");
        w.setExtra(1500);

        return w;
    }

    private CompanyApp()
    {
    }

    public static void run()
    {
        HumanResources humanResources = new HumanResources();
        Manager m = getManager();
        Worker w = getWorker();
        SalesManager sm = getSalesManager();
        ProjectWorker pw = getProjectWorker();

        humanResources.payInsurance(m);
        humanResources.payInsurance(w);
        humanResources.payInsurance(sm);
        humanResources.payInsurance(pw);
    }
}
