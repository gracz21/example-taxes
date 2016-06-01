package com.bartoszwalter.students.taxes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by inf109714 on 2016-05-20.
 */
public class TaxCalculatorTest {
    private double podstawa;

    @Before
    public void setup() {
        podstawa = 1000.0;
    }

    @Test
    public void obliczZaliczkeTest() {
        TaxCalculator.obliczPodatek(podstawa);
        TaxCalculator.obliczUbezpieczenia(podstawa);
        TaxCalculator.obliczZaliczke();
        assertEquals(TaxCalculator.zaliczkaUS, 56.17, 0.0);
    }

    @Test
    public void obliczPodatekTest() {
        TaxCalculator.obliczPodatek(podstawa);
        assertEquals(TaxCalculator.zaliczkaNaPod, 180.0, 0.0);
    }

    @Test
    public void obliczonaPodstawaTest() {
        assertEquals(TaxCalculator.obliczonaPodstawa(podstawa), 862.9, 0.0);
        assertEquals(TaxCalculator.s_emerytalna, 97.6, 0.0);
        assertEquals(TaxCalculator.s_rentowa, 15, 0.0);
        assertEquals(TaxCalculator.u_chorobowe, 24.5, 0.0);
    }

    @Test
    public void obliczUbezpieczeniaTest() {
        TaxCalculator.obliczUbezpieczenia(podstawa);
        assertEquals(TaxCalculator.s_zdrow1, 90.0, 0.0);
        assertEquals(TaxCalculator.s_zdrow2, 77.5, 0.0);
    }
}