package contracts;

/**
 * Created by inf109714 on 2016-05-20.
 */
public class EmploymentContract extends Contract {
    public EmploymentContract(double podstawa) {
        super(podstawa);
    }

    @Override
    public double obliczWynagrodzenie() {
        System.out.println("UMOWA O PRACĘ");
        System.out.println("Podstawa wymiaru składek " + podstawa);
        double oPodstawa = obliczonaPodstawa(podstawa);
        System.out
                .println("Podstawa wymiaru składki na ubezpieczenie zdrowotne: "
                        + oPodstawa);
        obliczUbezpieczenia(oPodstawa);
        double podstawaOpodat = oPodstawa - kosztyUzyskaniaPrzychodu;
        double podstawaOpodat0 = Double
                .parseDouble(df.format(podstawaOpodat));
        System.out.println("Podstawa opodatkowania " + podstawaOpodat
                + " zaokrąglona " + df.format(podstawaOpodat0));
        obliczPodatek(podstawaOpodat0);
        System.out.println("Zaliczka na podatek dochodowy 18 % = "
                + zaliczkaNaPod);
        System.out.println("Kwota wolna od podatku = " + kwotaZmiejsz);
        double podatekPotracony = zaliczkaNaPod - kwotaZmiejsz;
        System.out.println("Podatek potrącony = "
                + df00.format(podatekPotracony));
        obliczZaliczke();
        zaliczkaUS0 = Double.parseDouble(df.format(zaliczkaUS));
        System.out.println("Zaliczka do urzędu skarbowego = "
                + df00.format(zaliczkaUS) + " po zaokrągleniu = "
                + df.format(zaliczkaUS0));
        double wynagrodzenie = podstawa
                - ((s_emerytalna + s_rentowa + u_chorobowe) + s_zdrow1 + zaliczkaUS0);
        System.out.println();
        System.out
                .println("Pracownik otrzyma wynagrodzenie netto w wysokości = "
                        + df00.format(wynagrodzenie));
        return 0;
    }
}
