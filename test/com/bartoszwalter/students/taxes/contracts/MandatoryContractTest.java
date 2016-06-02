package com.bartoszwalter.students.taxes.contracts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kamil Walkowiak
 */
public class MandatoryContractTest {
    private MandatoryContract contract;

    @Before
    public void setUp() {
        double podstawa = 1000;
        contract = new MandatoryContract(podstawa);
    }

    @Test
    public void obliczKwoteZmniejszajacaIKosztUzyskania() {
        contract.podstawaSkladkiZdrowotnej = 100;

        contract.obliczKwoteZmniejszajacaIKosztUzyskania();
        assertEquals(0.0, contract.kwotaZmiejszajacaPodatek, 0.0);
        assertEquals(20.0, contract.kosztyUzyskaniaPrzychodu, 0.0);
    }
}