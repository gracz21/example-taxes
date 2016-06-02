package com.bartoszwalter.students.taxes.contracts;

/**
 * Created by inf109714 on 2016-05-20.
 */
public class EmploymentContract extends Contract {
    public EmploymentContract(double podstawa) {
        super(podstawa);
    }

    @Override
    void obliczKwoteZmniejszajacaIKosztUzyskania() {
        kwotaZmiejszajacaPodatek = 46.33;
        kosztyUzyskaniaPrzychodu = 111.25;
    }

    @Override
    public void printResult() {
        System.out.println("UMOWA O PRACĘ");
        super.printResult();
    }
}
