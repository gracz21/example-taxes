package com.bartoszwalter.students.taxes.contracts;

/**
 * Created by inf109714 on 2016-05-20.
 */
public class MandatoryContract extends Contract {
    public MandatoryContract(double podstawa) {
        super(podstawa);
    }

    @Override
    void obliczKwoteZmniejszajacaIKosztUzyskania() {
        kwotaZmiejszajacaPodatek = 0;
        kosztyUzyskaniaPrzychodu = (podstawaSkladkiZdrowotnej * 20) / 100;
    }

    @Override
    public void printResult() {
        System.out.println("UMOWA-ZLECENIE");
        super.printResult();
    }
}
