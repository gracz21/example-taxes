package contracts;

import java.text.DecimalFormat;

/**
 * Created by inf109714 on 2016-05-20.
 */
public abstract class Contract {
    protected double podstawa;

    protected double procentSkladkiEmerztalnej = 9.76;
    protected double procentSkladkiRentowej = 1.5;
    protected double procentUbezpieczeniaChorobowego = 2.45;

    protected double skladkaEmerytalna = 0;
    protected double skladkaRentowa = 0;
    protected double ubezpieczenieChorobowe = 0;

    protected double procentSkladkiZdrowotnej1 = 9.0;
    protected double procentSkladkiZdrowotnej2 = 7.75;
    protected double procentZaliczkiNaPodatekDochodowy = 18.0;
    protected double kwotaZmiejszajacaPodatek = 46.33;

    protected double kosztyUzyskaniaPrzychodu = 111.25;
    protected double skladkaZdrowotna1 = 0;
    protected double skladkaZdrowotna2 = 0;
    protected double zaliczkaNaPodatekDochodowy = 0;
    protected double zaliczkaNaUS = 0;
    protected double zaliczkaUS0 = 0;

    DecimalFormat dfCzescCalkowita;
    DecimalFormat dfCzescDziesietna;

    public Contract(double podstawa) {
        this.podstawa = podstawa;
        this.dfCzescCalkowita = new DecimalFormat("#");
        this.dfCzescDziesietna = new DecimalFormat("#.00");
    }

    public void obliczZaliczke() {
        zaliczkaNaUS = zaliczkaNaPodatekDochodowy - skladkaZdrowotna2 - kwotaZmiejszajacaPodatek;
    }

    public void obliczPodatek(double podstawa) {
        zaliczkaNaPodatekDochodowy = (podstawa * procentZaliczkiNaPodatekDochodowy) / 100;
    }

    public double obliczonaPodstawa(double podstawa) {
        skladkaEmerytalna = (podstawa * procentSkladkiEmerztalnej) / 100;
        skladkaRentowa = (podstawa * procentSkladkiRentowej) / 100;
        ubezpieczenieChorobowe = (podstawa * procentUbezpieczeniaChorobowego) / 100;

        System.out.println("Składka na ubezpieczenie emerytalne "
                + dfCzescDziesietna.format(skladkaEmerytalna));
        System.out.println("Składka na ubezpieczenie rentowe    "
                + dfCzescDziesietna.format(skladkaRentowa));
        System.out.println("Składka na ubezpieczenie chorobowe  "
                + dfCzescDziesietna.format(ubezpieczenieChorobowe));

        return (podstawa - skladkaEmerytalna - skladkaRentowa - ubezpieczenieChorobowe);
    }

    public void obliczUbezpieczenia(double podstawa) {
        skladkaZdrowotna1 = (podstawa * procentSkladkiZdrowotnej1) / 100;
        skladkaZdrowotna2 = (podstawa * procentSkladkiZdrowotnej2) / 100;

        System.out.println("Składka na ubezpieczenie zdrowotne: 9% = "
                + dfCzescDziesietna.format(skladkaZdrowotna1) + " 7,75% = " + dfCzescDziesietna.format(skladkaZdrowotna2));
        System.out.println("Koszty uzyskania przychodu w stałej wysokości "
                + kosztyUzyskaniaPrzychodu);
    }

    public abstract double obliczWynagrodzenie();
}
