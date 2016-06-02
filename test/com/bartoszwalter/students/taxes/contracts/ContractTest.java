package com.bartoszwalter.students.taxes.contracts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Kamil Walkowiak
 */
public class ContractTest {
    private Contract contract;

    @Before
    public void setUp() {
        double podstawa = 1000;
        contract = new EmploymentContract(podstawa);
    }

    @Test
    public void obliczWynagrodzenie() throws Exception {
        assertEquals(763.24, Math.round(100.0 * contract.obliczWynagrodzenie()) / 100.0, 0.0);
    }

}