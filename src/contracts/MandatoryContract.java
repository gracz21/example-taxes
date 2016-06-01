package contracts;

/**
 * Created by inf109714 on 2016-05-20.
 */
public class MandatoryContract extends Contract {
    public MandatoryContract(double podstawa) {
        super(podstawa);
    }

    @Override
    public double obliczWynagrodzenie() {
        return 0;
    }
}
