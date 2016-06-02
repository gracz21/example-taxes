package com.bartoszwalter.students.taxes.contracts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kamil Walkowiak
 */
public class EmploymentContractTest {
    private EmploymentContract contract;

    @Before
    public void setUp() {
        double podstawa = 1000;
        contract = new EmploymentContract(podstawa);
    }

    @Test
    public void obliczKwoteZmniejszajacaIKosztUzyskania() {
        contract.obliczKwoteZmniejszajacaIKosztUzyskania();
        assertEquals(46.33, contract.kwotaZmiejszajacaPodatek, 0.0);
        assertEquals(111.25, contract.kosztyUzyskaniaPrzychodu, 0.0);
    }
}